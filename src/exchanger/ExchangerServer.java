package exchanger;

import common.Currencies;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ExchangerServer {
	private int port = 50051;
	private Server server;

	private void start() throws IOException {
		HashMap<Currencies, Float> state = this.initCurrencies();

		server = ServerBuilder.forPort(port)
				.addService(new ExchangerStreamImpl(state))
				.build()
				.start();

		System.out.println("[EXCHANGER STARTED] Post: " + port);

		// Start currencies oscillations
		new CurrenciesThread(state).start();

		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				// Use stderr here since the logger may have been reset by its JVM shutdown hook.
				System.err.println("*** shutting down gRPC server since JVM is shutting down");
				ExchangerServer.this.stop();
				System.err.println("*** server shut down");
			}
		});
	}

	private HashMap<Currencies, Float> initCurrencies() {
		HashMap<Currencies, Float> state = new HashMap<>();
		Random generator = new Random();

		for (Currencies currency : Currencies.values()) {
			Float value = generator.nextFloat();
			state.put(currency, value);
			System.out.println(value);
		}

		return state;
	}

	private void stop() {
		if (server != null) {
			server.shutdown();
		}
	}

	/**
	 * Await termination on the main thread since the grpc library uses daemon threads.
	 */
	private void blockUntilShutdown() throws InterruptedException {
		if (server != null) {
			server.awaitTermination();
		}
	}

	/**
	 * Main launches the server from the command line.
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
		final ExchangerServer server = new ExchangerServer();
		server.start();
		server.blockUntilShutdown();
	}

}

class CurrenciesThread extends Thread {
	private HashMap<Currencies, Float> state;

	CurrenciesThread(HashMap<Currencies, Float> state) {
		this.state = state;
	}

	public void run() {
		while (true) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			synchronized (this.state) {
				for (Map.Entry<Currencies, Float> entry : this.state.entrySet()) {
					Currencies currency = entry.getKey();
					Float value = entry.getValue();

					entry.setValue(value * 1.5f);

					System.out.println(currency + " " + value * 1.5f);
				}
			}
		}
	}
}

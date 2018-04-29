package bank;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import sr.grpc.exchanger.CurrenciesList;
import sr.grpc.exchanger.CurrenciesState;
import sr.grpc.exchanger.ExchangerStreamGrpc;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class ExchangerClient {
	private final ManagedChannel channel;
	private final ExchangerStreamGrpc.ExchangerStreamBlockingStub streamTesterBlockingStub;


	/** Construct client connecting to HelloWorld server at {@code host:port}. */
	public ExchangerClient(String host, int port) {
		channel = ManagedChannelBuilder.forAddress(host, port)
				// Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid needing certificates.
				.usePlaintext(true)
				.build();

		streamTesterBlockingStub = ExchangerStreamGrpc.newBlockingStub(channel);
	}

	public static void main(String[] args) throws Exception {
		ExchangerClient client = new ExchangerClient("localhost", 50051);

		client.connectExchanger();
	}

	public void shutdown() throws InterruptedException {
		channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
	}

	public void connectExchanger() {
		CurrenciesList currenciesList = CurrenciesList.newBuilder().addCurrencies("PLN").addCurrencies("EUR").build();
		Iterator<CurrenciesState> states;

		try {
			states = streamTesterBlockingStub.getCurrencies(currenciesList);
			while(states.hasNext()) {
				CurrenciesState state = states.next();

				for (Map.Entry<String, Float> entry : state.getCurrenciesMap().entrySet()) {
					String currency = entry.getKey();
					Float value = entry.getValue();

					System.out.println(currency + " " + value);
				}
			}
		} catch (StatusRuntimeException ex) {
			return;
		}
	}
}

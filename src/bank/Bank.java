package bank;

import exchanger.Currencies;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import org.apache.thrift.TMultiplexedProcessor;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import sr.grpc.exchanger.CurrenciesList;
import sr.grpc.exchanger.CurrenciesState;
import sr.grpc.exchanger.ExchangerStreamGrpc;
import sr.rpc.bank.Account;
import sr.rpc.bank.BankManager;
import sr.rpc.bank.BankPremium;
import sr.rpc.bank.BankStandard;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Bank {
	private final ManagedChannel channel;
	private final ExchangerStreamGrpc.ExchangerStreamBlockingStub streamTesterBlockingStub;

	private HashMap<String, Account> accounts = new HashMap<>();
	private HashMap<Currencies, Float> currencies = new HashMap<>();


	/** Construct client connecting to HelloWorld server at {@code host:port}. */
	public Bank(String host, int port) {
		channel = ManagedChannelBuilder.forAddress(host, port)
				// Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid needing certificates.
				.usePlaintext(true)
				.build();

		streamTesterBlockingStub = ExchangerStreamGrpc.newBlockingStub(channel);
	}

	public static void main(String[] args) throws Exception {
		Bank bank = new Bank("localhost", 50051);

		try {
			new Thread(() -> multiplex(bank.accounts, bank.currencies, Integer.parseInt(args[0]))).start();
		} catch (Exception x) {
			x.printStackTrace();
		}

		bank.connectExchanger(args[1], args[2]);
	}

	public void shutdown() throws InterruptedException {
		channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
	}

	public void connectExchanger(String currency1, String currency2) {
		CurrenciesList currenciesList = CurrenciesList.newBuilder().addCurrencies(currency1).addCurrencies(currency2).build();
		Iterator<CurrenciesState> states;

		try {
			states = streamTesterBlockingStub.getCurrencies(currenciesList);
			while(states.hasNext()) {
				CurrenciesState state = states.next();

				synchronized (this.currencies) {
					this.currencies.clear();

					for (Map.Entry<String, Float> entry : state.getCurrenciesMap().entrySet()) {
						String currency = entry.getKey();
						Float value = entry.getValue();

						this.currencies.put(Currencies.valueOf(currency), value);
						System.out.println(currency + " " + value);
					}
				}
			}
		} catch (StatusRuntimeException ex) {
			return;
		}
	}

	public static void multiplex(HashMap<String, Account> accounts, HashMap<Currencies, Float> currencies, Integer port) {
		try {
			BankManager.Processor<BankManagerHandler> processor1 = new BankManager.Processor<BankManagerHandler>(new BankManagerHandler(accounts));
			BankStandard.Processor<BankStandardHandler> processor2 = new BankStandard.Processor<BankStandardHandler>(new BankStandardHandler(accounts, currencies));
			BankPremium.Processor<BankPremiumHandler> processor3 = new BankPremium.Processor<BankPremiumHandler>(new BankPremiumHandler(accounts, currencies));

			TServerTransport serverTransport = new TServerSocket(port);

			TProtocolFactory protocolFactory = new TBinaryProtocol.Factory();

			TMultiplexedProcessor multiplex = new TMultiplexedProcessor();
			multiplex.registerProcessor("Manager", processor1);
			multiplex.registerProcessor("Standard", processor2);
			multiplex.registerProcessor("Premium", processor3);

			TServer server = new TSimpleServer(new TServer.Args(serverTransport).protocolFactory(protocolFactory).processor(multiplex));

			System.out.println("[STARTING BANK] Port: " + port.toString());

			server.serve();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

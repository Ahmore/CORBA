package exchanger;

import io.grpc.stub.StreamObserver;
import sr.grpc.exchanger.CurrenciesList;
import sr.grpc.exchanger.CurrenciesState;
import sr.grpc.exchanger.ExchangerStreamGrpc.ExchangerStreamImplBase;

import java.util.HashMap;

public class ExchangerStreamImpl extends ExchangerStreamImplBase {
    private HashMap<Currencies, Float> state;

    public ExchangerStreamImpl(HashMap<Currencies, Float> state) {
        this.state = state;
    }

    @Override
    public void getCurrencies(CurrenciesList currenciesList, StreamObserver<CurrenciesState> responseObserver) {
        System.out.println("[START STREAMING]");

        CurrenciesState.Builder builder = CurrenciesState.newBuilder();

        for (int i = 0; i < 100; i++) {
            synchronized (this.state) {
                for (String currency : currenciesList.getCurrenciesList()) {
                    builder.putCurrencies(currency, this.state.get(Currencies.valueOf(currency)));
                }
            }

            responseObserver.onNext(builder.build());

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        responseObserver.onCompleted();
    }
}

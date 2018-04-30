package exchanger;

import java.util.HashMap;
import java.util.Map;

public class CurrenciesOscillator extends Thread {
    private HashMap<Currencies, Float> state;

    CurrenciesOscillator(HashMap<Currencies, Float> state) {
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

                    entry.setValue(value * 1.1f);

                    System.out.println("[" + currency + "] " + (value * 1.1f));
                }
            }
        }
    }
}

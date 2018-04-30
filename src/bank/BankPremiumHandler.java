package bank;

import exchanger.Currencies;
import org.apache.thrift.TException;
import sr.rpc.bank.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

public class BankPremiumHandler implements BankPremium.Iface {
    private HashMap<String, Account> accounts;
    private HashMap<Currencies, Float> currenciesState;

    public BankPremiumHandler(HashMap<String, Account> accounts, HashMap<Currencies, Float> currenciesState) {
        this.accounts = accounts;
        this.currenciesState = currenciesState;
    }

    @Override
    public CreditResponse getCredit(CreditRequest creditRequest) throws AccountDoesNotExist, InvalidAccountType, TException {
        System.out.println("[CREDIT PREMIUM REQUEST]");

        Account account = null;

        for (Map.Entry<String, Account> entry : this.accounts.entrySet()) {
            String pesel = entry.getKey();
            Account account1 = entry.getValue();

            if (account1.getGuid().equals(creditRequest.guid)) {
                account = account1;
                break;
            }
        }

        if (account == null) {
            throw new AccountDoesNotExist(creditRequest.guid, "Account does not exist.");
        }

        if (account.type == AccountType.STANDARD) {
            throw new InvalidAccountType(creditRequest.guid, "Invalid account type.");
        }

        CreditResponse creditResponse = null;

        synchronized (this.currenciesState) {
            Calendar fromDate = new GregorianCalendar(creditRequest.fromDate.year, creditRequest.fromDate.month-1, creditRequest.fromDate.day);
            Calendar toDate = new GregorianCalendar(creditRequest.toDate.year, creditRequest.toDate.month-1, creditRequest.toDate.day);

            double years = Math.abs((fromDate.getTimeInMillis() - toDate.getTimeInMillis())/(1000*60*60*24))/365.0;
            double interest = 10.0;

            double creditCost = years * (1 + interest) * creditRequest.amount;

            double nativeCurrency = this.currenciesState.get(Currencies.valueOf(account.currency));
            double creditCurrency = this.currenciesState.get(Currencies.valueOf(creditRequest.currency));

            creditResponse = new CreditResponse();
            creditResponse.currency1 = account.currency;
            creditResponse.currency2 = creditRequest.currency;
            creditResponse.amount1 = creditCost * (nativeCurrency / creditCurrency);
            creditResponse.amount2 = creditCost;
        }

        return creditResponse;
    }

    @Override
    public Account getInfo(String guid) throws AccountDoesNotExist, InvalidAccountType, TException {
        System.out.println("[ACCOUNT INFO PREMIUM REQUEST]");

        Account account = null;

        for (Map.Entry<String, Account> entry : this.accounts.entrySet()) {
            String pesel = entry.getKey();
            Account account1 = entry.getValue();

            if (account1.getGuid().equals(guid)) {
                account = account1;
                break;
            }
        }

        if (account == null) {
            throw new AccountDoesNotExist(guid, "Account does not exist.");
        }

        if (account.type == AccountType.STANDARD) {
            throw new InvalidAccountType(guid, "Invalid account type.");
        }

        return account;
    }
}

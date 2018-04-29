package bank;

import common.Currencies;
import org.apache.thrift.TException;
import sr.rpc.bank.*;

import java.util.HashMap;
import java.util.Map;

public class BankPremiumHandler implements BankPremium.Iface {
    private HashMap<Long, Account> accounts;
    private HashMap<Currencies, Float> currenciesState;

    public BankPremiumHandler(HashMap<Long, Account> accounts, HashMap<Currencies, Float> currenciesState) {
        this.accounts = accounts;
        this.currenciesState = currenciesState;
    }

    @Override
    public CreditResponse getCredit(CreditRequest creditRequest) throws AccountDoesNotExist, InvalidAccountType, TException {
        synchronized (this.currenciesState) {
            // TODO
        }

        return null;
    }

    @Override
    public Account getInfo(String guid) throws AccountDoesNotExist, InvalidAccountType, TException {
        Account account = null;

        for (Map.Entry<Long, Account> entry : this.accounts.entrySet()) {
            Long pesel = entry.getKey();
            Account account1 = entry.getValue();

            if (account1.getGuid() == guid) {
                account = account1;
                break;
            }
        }

        if (account == null) {
            throw new AccountDoesNotExist(guid, "Account does not exist.");
        }

        if (account.type == AccountType.PREMIUM) {
            throw new InvalidAccountType(guid, "Invalid account type.");
        }

        return account;
    }
}

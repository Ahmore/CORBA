package bank;

import common.Currencies;
import org.apache.thrift.TException;
import sr.rpc.bank.*;

import java.util.HashMap;
import java.util.Map;

public class BankStandardHandler implements BankStandard.Iface {
    private HashMap<String, Account> accounts;
    private HashMap<Currencies, Float> currenciesState;

    public BankStandardHandler(HashMap<String, Account> accounts, HashMap<Currencies, Float> currenciesState) {
        this.accounts = accounts;
        this.currenciesState = currenciesState;
    }

    @Override
    public Account getInfo(String guid) throws AccountDoesNotExist, InvalidAccountType, TException {
        System.out.println("[ACCOUNT INFO STANDARD REQUEST]");

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

        if (account.type == AccountType.PREMIUM) {
            throw new InvalidAccountType(guid, "Invalid account type.");
        }

        return account;
    }
}

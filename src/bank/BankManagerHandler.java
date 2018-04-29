package bank;

import org.apache.thrift.TException;
import sr.rpc.bank.Account;
import sr.rpc.bank.AccountExists;
import sr.rpc.bank.AccountType;
import sr.rpc.bank.BankManager;

import java.util.HashMap;

public class BankManagerHandler implements BankManager.Iface {
    private HashMap<Long, Account> accounts;

    public BankManagerHandler(HashMap<Long, Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String create(Account account) throws AccountExists, TException {
        if (this.accounts.containsKey(account.pesel)) {
            throw new AccountExists(account.pesel, "Client already exists.");
        }

        account.setGuid(java.util.UUID.randomUUID().toString());

        if (account.income > 2000) {
            account.type = AccountType.PREMIUM;
        }
        else {
            account.type = AccountType.STANDARD;
        }

        this.accounts.put(account.pesel, account);

        return account.getGuid();
    }
}

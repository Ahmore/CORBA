package bank;

import org.apache.thrift.TException;
import sr.rpc.bank.*;

import java.util.HashMap;
import java.util.Map;

public class BankManagerHandler implements BankManager.Iface {
    private HashMap<String, Account> accounts;

    public BankManagerHandler(HashMap<String, Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public Account create(Account account) throws AccountExists, TException {
        System.out.println("[NEW ACCOUNT REQUEST]");

        // TODO Pesel should be string
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

        System.out.println("[NEW ACCOUNT CREATED]");

        return account;
    }

    @Override
    public Account login(String guid) throws AccountDoesNotExist, TException {
        System.out.println("[LOGIN ACCOUNT REQUEST]");

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

        return account;
    }
}

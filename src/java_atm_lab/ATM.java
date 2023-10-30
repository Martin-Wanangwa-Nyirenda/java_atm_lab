package java_atm_lab;
import java.util.ArrayList;

class ATM {
    private ArrayList<Account> accounts;

    public ATM() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void withdraw(String accNumber, String pin, double amount) {
        Account account = findAccount(accNumber, pin);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found or PIN is incorrect.");
        }
    }

    public void deposit(String accNumber, String pin, double amount) {
        Account account = findAccount(accNumber, pin);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found or PIN is incorrect.");
        }
    }

    private Account findAccount(String accNumber, String pin) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accNumber) && account.getPin().equals(pin)) {
                return account;
            }
        }
        return null;
    }
}


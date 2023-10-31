
   import java.util.ArrayList;


public class ATM {
    private final ArrayList<Account> accounts;

    public ATM() {
        accounts = new ArrayList<>();
    }

    public void addAccount(int accountNumber, int pin) {
        accounts.add(new Account(accountNumber, pin));
    }

    public boolean withdraw(int accountNumber, int pin, double amount) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber && account.getPin() == pin) {
                return account.withdraw(amount);
            }
        }
        return false; // Account not found or incorrect PIN
    }

    public void deposit(int accountNumber, int pin, double amount) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber && account.getPin() == pin) {
                account.deposit(amount);
                break;
            }
        }
    }
}

   


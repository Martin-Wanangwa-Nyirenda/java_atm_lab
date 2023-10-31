import java.util.Scanner;

public class Account {
    private String accountNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
    private String accountHolder;
    private double balance;
    private int age;
    private String pin;

    // Constructor to initialize the account
    public Account(String accountNumber, String accountHolder, int age, String pin, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.age = age;
        this.pin = pin;
        this.balance = balance;
    }

    // Method to display account information
    public void displayAccountInfo() {
        System.out.println("Account Information:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Age: " + age);
        System.out.println("PIN: " + pin);
        System.out.println("Balance: K" + balance);
    }

    // Main method for testing the Account class
   
}

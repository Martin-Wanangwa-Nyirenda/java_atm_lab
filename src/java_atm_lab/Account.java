package java_atm_lab;

class Account {
    private String name;
    private int age;
    private String accountNumber;
    private double balance;
    private String pin;

    public Account(String name, int age, String accountNumber, double balance, String pin) {
        this.name = name;
        this.age = age;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.pin = pin;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn K" + amount + " from account " + accountNumber);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited K" + amount + " to account " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
}


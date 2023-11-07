package java_atm_lab;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        ATM atm = new ATM();

        // Adding sample accounts to the ATM
        atm.addAccount(new Account("John Doe", 30, "1234567890", 1000.0, "1234"));
        atm.addAccount(new Account("Jane Smith", 25, "9876543210", 1500.0, "5678"));

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
        	System.out.println("\n\nHello customer\n");
            System.out.print("Enter account number: ");
            String accNumber = scanner.next();
            System.out.print("Enter PIN: ");
            String pin = scanner.next();

            System.out.print("Select an option (1 for Withdraw, 2 for Deposit, 3 to Exit): ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter withdrawal amount: $");
                    double amount = scanner.nextDouble();
                    atm.withdraw(accNumber, pin, amount);
                    break;
                case 2:
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(accNumber, pin, depositAmount);
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }

        scanner.close();
        System.out.println("Thank you for using the ATM. Have a great day!");
    }

}

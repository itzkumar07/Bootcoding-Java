package bankingapplication;

import static java.lang.System.*;
import java.util.Scanner;

public class BankAccount {
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    BankAccount(String customerName, String customerId) {
        this.customerName = customerName;
        this.customerId = customerId;
    }

    void deposit(double amount) {
        if (amount != 0) {
            balance += (int) amount;
            previousTransaction = (int) amount;
        }   
    }

    void withdraw(int amount) {
        if (amount != 0) {
            balance -= amount;
            previousTransaction = -amount;
        }
    }

    void getPreviousTransaction(){
        if (previousTransaction > 0) {
            out.println("Deposited: " + previousTransaction);
        } else if (previousTransaction < 0) {
            out.println("Withdrawn: " + Math.abs(previousTransaction));
        } else {
            out.println("No transaction occurred");
        }
    }

    void showMenu() {
        char option = '\0';
        try (Scanner scanner = new Scanner(System.in)) {
            out.println("Welcome to the bank!"+ customerName);
            out.println("Your Id " + customerId);
            out.println("\n");
            out.println("A. Check balance");
            out.println("B. Deposit");
            out.println("C. Withdraw");
            out.println("D. Previous transaction");
            out.println("E. Exit");

            do {
                out.println("Enter an option");
                option = scanner.next().charAt(0);
                option = Character.toUpperCase(option);

                switch(option) {
                    case 'A':
                        out.println("Balance: " + balance);
                        break;
                    case 'B':
                        out.println("Enter an amount to deposit");
                        int amount = scanner.nextInt();
                        deposit(amount);
                        break;
                    case 'C':
                        out.println("Enter an amount to withdraw");
                        int amount2 = scanner.nextInt();
                        withdraw(amount2);
                        break;
                    case 'D':
                        getPreviousTransaction();
                        break;
                    case 'E':
                        out.println("Exiting...");
                        break;
                    default:
                        out.println("Invalid option. Please try again.");
                        break;
                }
            } while (option != 'E');
        }

        out.println("Thank you for using our services!");
    }
}

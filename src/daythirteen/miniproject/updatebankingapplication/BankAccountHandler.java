package daythirteen.miniproject.updatebankingapplication;

import java.util.Scanner;
import static java.lang.System.*;

public class BankAccountHandler implements BankAccountOperations {
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    BankAccountHandler() {
        this.customerName = " John Doe";
        this.customerId = "12345";
    }

    @Override
    public void deposit(double amount) {
        if (amount != 0) {
            balance += amount;
            previousTransaction = (int) amount;
        } 
    }

    @Override
    public void withdraw(int amount) {
        if (amount != 0) {
            balance -= amount;
            previousTransaction = -amount;
        }

    }

    @Override
    public void getPreviousTransaction() {
        if (previousTransaction > 0) {
            out.println("Deposited: " + previousTransaction);
        } else if (previousTransaction < 0) {
            out.println("Withdrawn: " + Math.abs(previousTransaction));
        } else {
            out.println("No transaction occured");
        }

    }

    @Override
    public void showMenu() {
        char option = '\0';
        Scanner scanner = new Scanner(System.in);

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
            Character.toUpperCase(option);

            switch(option) {
                case 'A':
                    out.println("Balance: " + balance);
                    break;
                case 'B':
                    out.println("Enter an amount to deposit");
                    double amount = scanner.nextDouble();
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
                   out.println("Thank you for banking with us");
                    break;
                default:
                    out.println("Invalid option! Please try again");
                    break;
            }
        } while (option != 'E');
        scanner.close();
    }

    @Override
    public void printMethods() {
        deposit(0);
        withdraw(0);
        getPreviousTransaction();
        showMenu();
    }
    
}

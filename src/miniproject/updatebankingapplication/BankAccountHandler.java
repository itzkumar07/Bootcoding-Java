package updatebankingapplication;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;

public class BankAccountHandler implements BankAccountOperations {
    double balance;  // Changed to double for accuracy
    ArrayList<String> transactionHistory;  // List to hold the transaction history
    String customerName;
    String customerId;
    private static final String SEPARATOR = "--------------------------------------------------------------";
    private static final String BALANCE_SUFFIX = " | Balance: ";

    BankAccountHandler() {
        this.customerName = "John Doe";
        this.customerId = "12345";
        this.balance = 0.0;
        this.transactionHistory = new ArrayList<>();
    }


    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            transactionHistory.add("Deposited: " + amount + " at " + timestamp + BALANCE_SUFFIX + balance);
            out.println("Deposited: " + amount + " at " + timestamp + BALANCE_SUFFIX + balance);
            out.println("Deposited: " + amount + " at " + timestamp + BALANCE_SUFFIX + balance);
        } else {
            out.println("Deposit amount must be greater than 0.");
        }
    }

    @Override
    public void withdraw(int amount) {
        if (amount <= 0) {
            out.println("Withdrawal amount must be greater than 0.");
        } else if (amount > balance) {
            out.println("Insufficient funds for withdrawal.");
        } else {
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            transactionHistory.add("Withdrawn: " + amount + " at " + timestamp + BALANCE_SUFFIX + balance);
            out.println("Withdrawn: " + amount + " at " + timestamp + BALANCE_SUFFIX + balance);
            out.println("Withdrawn: " + amount + " at " + timestamp + BALANCE_SUFFIX + balance);
            out.println("Withdrawn: " + amount + " at " + timestamp + " | Balance: " + balance);
        }
    }

    @Override
    public void getPreviousTransaction() {
        if (!transactionHistory.isEmpty()) {
            out.println("Most recent transaction: " + transactionHistory.get(transactionHistory.size() - 1));
        } else {
            out.println("No transactions occurred yet.");
        }
    }

    @Override
    public void showMenu() {
        char option;
        Scanner scanner = new Scanner(System.in);

        out.println("Welcome to the bank! " + customerName);
        out.println("Your Id: " + customerId);
        out.println("\n");
        out.println("A. Check balance");
        out.println("B. Deposit");
        out.println("C. Withdraw");
        out.println("D. Previous transaction");
        out.println("E. View passbook");
        out.println("F. Exit");

        do {
            out.println("Enter an option: ");
            option = scanner.next().charAt(0);
            option = Character.toUpperCase(option);  // Normalize to uppercase

            switch(option) {
                case 'A':
                    out.println("Balance: " + balance);
                    break;
                case 'B':
                    out.println("Enter an amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    break;
                case 'C':
                    out.println("Enter an amount to withdraw: ");
                    int withdrawAmount = scanner.nextInt();
                    withdraw(withdrawAmount);
                    break;
                case 'D':
                    getPreviousTransaction();
                    break;
                case 'E':
                    viewPassbook();
                    break;
                case 'F':
                    out.println("Thank you for banking with us.");
                    break;
                default:
                    out.println("Invalid option! Please try again.");
                    break;
            }
        } while (option != 'F');
        scanner.close();
    }

    private void viewPassbook() {
        if (transactionHistory.isEmpty()) {
            out.println("No transactions yet.");
        } else {
            out.println(SEPARATOR);
            out.println("Date & Time              | Transaction Type | Amount   | Balance");
            out.println(SEPARATOR);
            for (String transaction : transactionHistory) {
                out.println(transaction);
            }
            out.println(SEPARATOR);
            out.println(SEPARATOR);
        }
    }

    @Override
    public void printMethods() {
        deposit(0);  // Example method call
        withdraw(0);  // Example method call
        getPreviousTransaction();  // Example method call
        showMenu();  // Calling showMenu method to display menu to user
    }
}

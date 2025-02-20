package collection.atm;

import java.util.Scanner;   
import static java.lang.System.*;

public class ATMApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM(5000); // Initial balance 5000

        while (true) {
            out.println("\nATM Menu:\n1. Check Balance\n2. Deposit\n3. Withdraw\n4. Exit");
            out.print("Choose an option: ");
            int choice = scanner.nextInt();

            try {
                switch (choice) {
                    case 1:
                        atm.checkBalance();
                        break;
                    case 2:
                        out.print("Enter deposit amount: ");
                        double depositAmount = scanner.nextDouble();
                        atm.deposit(depositAmount);
                        break;
                    case 3:
                        out.print("Enter withdrawal amount: ");
                        double withdrawAmount = scanner.nextDouble();
                        atm.withdraw(withdrawAmount);
                        break;
                    case 4:
                        out.println("Exiting... Thank you!");
                        scanner.close();
                        return;
                    default:
                        out.println("Invalid choice! Please try again.");
                }
            } catch (InsufficientFundsException e) {
                out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                out.println("Invalid input! Please enter a valid number.");
                scanner.next(); // Clear buffer
            }
        }
    }
}
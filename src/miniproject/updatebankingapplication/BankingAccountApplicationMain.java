package miniproject.updatebankingapplication;

public class BankingAccountApplicationMain {
    public static void main(String[] args) {
        BankAccountHandler bankAccountHandler = new BankAccountHandler();

        bankAccountHandler.printMethods(); 
        bankAccountHandler.printMethods(); // Calling method to initiate the banking operations
    }
}

package miniproject.updatebankingapplication;

public interface BankAccountOperations {

    void deposit(double amount);

    void withdraw(int amount);

    void getPreviousTransaction();

    void showMenu();

    void printMethods();
}

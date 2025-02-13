package bankingapplication;
public class BankingApplication {
    public static void main(String[] args) {
       
        BankAccount bankAccount = new BankAccount("Kumar Kankam", "M0001");
        bankAccount.showMenu();
        BankAccount bankAccount2 = new BankAccount("Kwame Kankam", "M0002");
        bankAccount2.showMenu(); 
    }    
}

package collection.atm;

import static java.lang.System.*;
class ATM {
    private double balance;

    public ATM(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds! Available balance: " + balance);
        }
        balance -= amount;
        out.println("Withdrawal successful! Remaining balance: " + balance);
    }

    public void deposit(double amount) {
        balance += amount;
        out.println("Deposit successful! Updated balance: " + balance);
    }

    public void checkBalance() {
        out.println("Current balance: " + balance);
    }
}
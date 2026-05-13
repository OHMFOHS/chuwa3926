package chuwa3926.Coding.Q13;

public class Wallet {
    private double balance;
    public Wallet (double initialBalance) {
        this.balance = initialBalance;
    }
    public void deposit (double amount) throws IllegalArgumentException{
        if(amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        this.balance += amount;
    }
    
    public void  withdraw(double amount) throws InsufficientBalanceException {
        if (this.balance < amount) {
            throw new InsufficientBalanceException("No enough balance.");
        }
        this.balance -= amount;
    }
    public double getBalance() {
        return balance;
    }
}

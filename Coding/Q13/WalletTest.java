package chuwa3926.Coding.Q13;

// Example main method
public class WalletTest {
    public static void main(String[] args) {
        try {
            // 1. Create a wallet with $100
            Wallet wallet = new Wallet(100);

            // 2. Deposit $50
            wallet.deposit(50);

            // 3. Try to withdraw $200 (should throw exception)
            wallet.withdraw(200);

        } catch (IllegalArgumentException e) {
            System.out.println("Deposit Error: " + e.getMessage());
        } catch (InsufficientBalanceException e) {
            System.out.println("Withdrawal Error: " + e.getMessage());
        }

        // Optional: print final balance
        Wallet wallet = new Wallet(150); // wallet after deposit
        System.out.println("Final balance: $" + wallet.getBalance());
    }
}
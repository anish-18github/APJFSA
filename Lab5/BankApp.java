package labs.lab5;

public class BankApp {
    public static void main(String[] args) {
        // Create an object of CheckingAccount
        CheckingAccount account = new CheckingAccount();

        // Call the deposit method
        account.deposit(500.0);

        // Call the deposit method
        account.deposit(500.0);

        // Attempt to withdraw an amount greater than the balance
        account.withdraw(400.0);
    }
}
         
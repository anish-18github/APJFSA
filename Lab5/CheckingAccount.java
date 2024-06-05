package labs.lab5;

// Class CheckingAccount implementing BankAccount interface
 class CheckingAccount implements BankAccount{
    // Private variable to store the account balance
    private double balance;
    
    // Constructor to initialize the balance to 0.0
    public CheckingAccount(){
        this.balance = 0.0;
    }

    // Implementation of the deposit method from the BankAccount interface
    // Adds the specified amount to the account balance if the amount is positive
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            // Print the deposited amount and the new balance
            System.out.println("Deposited: $" +amount + ", New Balance: $" + balance);
        } else {
            // Print a message if the deposit amount is not positive
            System.out.println("Deposit amount mus be positive.");
        }
    }

     // Implementation of the withdraw method from the BankAccount interface
    // Subtracts the specified amount from the account balance if the amount is positive and does not exceed the balance
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            // Print the withdrawn amount and the new balance
            System.out.println("Withdraw: $" +amount + ", New Balance: $" + balance);
        } else {
             // Print a message if there are insufficient funds or the withdraw amount is invalid
            System.out.println("Insufficient funds or invalid withdraw amount");
        }
    }
    // Method to get the current balance of the account
    public double getBalance() {
        return balance;
    }
}

class BankAccount {
    private String accountHolderName;
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    // Optional: Setters & Getters
}

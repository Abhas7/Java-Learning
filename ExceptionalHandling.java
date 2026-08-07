public class Accounts {
    private double balance;

    public Accounts(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws BalanceException {
        if (amount <= balance)
            balance -= amount;
        else
            throw new BalanceException("Insufficient balance");
    }

    public double getBalance() {
        return balance;
    }
}
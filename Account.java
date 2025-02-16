public class Account implements Depositable, Withdrawable, Balanceable {
    private double balance;

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void setBalance(double amount) {
        if (amount >= 0) {
            this.balance = amount;
        }
    }
}

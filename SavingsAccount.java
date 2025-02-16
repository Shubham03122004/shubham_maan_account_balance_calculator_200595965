public class SavingsAccount extends Account {
    private double monthlyInterestRate;
    private double monthlyInterestPayment;

    public SavingsAccount(double monthlyInterestRate) {
        this.monthlyInterestRate = monthlyInterestRate;
    }

    public void applyMonthlyInterest() {
        monthlyInterestPayment = getBalance() * monthlyInterestRate;
        deposit(monthlyInterestPayment);
    }

    public double getMonthlyInterestPayment() {
        return monthlyInterestPayment;
    }
}
public class CheckingAccount extends Account {
    private double monthlyFee;

    public CheckingAccount(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public void applyMonthlyFee() {
        withdraw(monthlyFee);
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }
}
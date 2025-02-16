import java.util.Scanner;

public class AccountBalanceApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize accounts
        CheckingAccount checkingAccount = new CheckingAccount(1.00); // $1.00 monthly fee
        SavingsAccount savingsAccount = new SavingsAccount(0.01); // 1% monthly interest rate

        // Set starting balances
        checkingAccount.setBalance(1000.00);
        savingsAccount.setBalance(1000.00);

        // Display welcome message and starting balances
        System.out.println("Welcome to the Account Balance Calculator");
        System.out.println("Starting Balances:");
        System.out.printf("Checking: $%.2f%n", checkingAccount.getBalance());
        System.out.printf("Savings: $%.2f%n", savingsAccount.getBalance());
        System.out.println();

        // Process transactions
        String continueTransaction = "y";
        while (continueTransaction.equalsIgnoreCase("y")) {
            System.out.print("Withdrawal or deposit? (w/d): ");
            String transactionType = scanner.nextLine();

            System.out.print("Checking or savings? (c/s): ");
            String accountType = scanner.nextLine();

            System.out.print("Amount?: ");
            double amount = Double.parseDouble(scanner.nextLine());

            if (transactionType.equalsIgnoreCase("w")) {
                if (accountType.equalsIgnoreCase("c")) {
                    checkingAccount.withdraw(amount);
                } else if (accountType.equalsIgnoreCase("s")) {
                    savingsAccount.withdraw(amount);
                }
            } else if (transactionType.equalsIgnoreCase("d")) {
                if (accountType.equalsIgnoreCase("c")) {
                    checkingAccount.deposit(amount);
                } else if (accountType.equalsIgnoreCase("s")) {
                    savingsAccount.deposit(amount);
                }
            }

            System.out.print("Continue? (y/n): ");
            continueTransaction = scanner.nextLine();
            System.out.println();
        }

        // Apply monthly fees and interest
        checkingAccount.applyMonthlyFee();
        savingsAccount.applyMonthlyInterest();

        // Display final balances
        System.out.println("Monthly Payments and Fees:");
        System.out.printf("Checking fee: $%.2f%n", checkingAccount.getMonthlyFee());
        System.out.printf("Savings interest payment: $%.2f%n", savingsAccount.getMonthlyInterestPayment());
        System.out.println();

        System.out.println("Final Balances:");
        System.out.printf("Checking: $%.2f%n", checkingAccount.getBalance());
        System.out.printf("Savings: $%.2f%n", savingsAccount.getBalance());

        scanner.close();
    }
}
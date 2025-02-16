# Account Balance Calculator

This is a Java application that calculates and displays the starting and ending monthly balances for a checking account and a savings account. It allows users to perform withdrawals and deposits and applies monthly fees and interest payments.

---

## **Project Details**
- **Student Name**: Shubham Maan
- **Student ID**: 200595965
- **Project Name**: Account Balance Calculator
- **Repository Name**: `shubham_maan_account_balance_calculator_200595965`

---

## **Features**
1. **Account Management**:
   - Supports checking and savings accounts.
   - Allows deposits and withdrawals.
2. **Monthly Calculations**:
   - Applies a monthly fee for checking accounts.
   - Applies monthly interest for savings accounts.
3. **User-Friendly Interface**:
   - Interactive console-based interface for transactions.
4. **Error Handling**:
   - Prevents withdrawals exceeding the account balance.

---

## **How It Works**
1. The application starts by displaying the initial balances for both accounts.
2. Users can perform transactions (withdrawals or deposits) on either account.
3. After completing transactions, the application applies:
   - A monthly fee for the checking account.
   - Monthly interest for the savings account.
4. The final balances are displayed.

---

## **Code Structure**
The project consists of the following files:

### **Interfaces**
1. `Depositable.java` - Defines the `deposit` method.
2. `Withdrawable.java` - Defines the `withdraw` method.
3. `Balanceable.java` - Defines the `getBalance` and `setBalance` methods.

### **Classes**
1. `Account.java` - Implements the interfaces and provides basic account functionality.
2. `CheckingAccount.java` - Extends `Account` and adds a monthly fee.
3. `SavingsAccount.java` - Extends `Account` and adds monthly interest.
4. `AccountBalanceApp.java` - The main application class that handles user input and displays results.

---

## **How to Run**
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/shubham_maan_account_balance_calculator_200595965.git

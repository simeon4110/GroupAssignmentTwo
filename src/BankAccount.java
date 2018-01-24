/**
 * Class is a simple bank account with balance and overdraftAmount instance variables.
 */
public class BankAccount {
    double balance;
    double overdraftAmount = 100;

    /**
     * Allows an arbitrary double to be added to the balance instance variable.
     * @param amount The amount to be deposited.
     */
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    /**
     * Verifies withdraws against the user's available balance + overdraftAmount.
     * @param amount The amount to withdraw.
     */
    public void withdraw(double amount) {
        if (amount > 0 && (this.balance + this.overdraftAmount) - amount >= 0) {
            this.balance -= amount;
        }
    }

    /**
     * Getter method returns the user's balance.
     * @return The user's balance as a double.
     */
    public double getBalance() {
        return this.balance;
    }

    /**
     * Sets user's overdraft amount.
     * @param amount The desired amount as a double.
     */
    public void setOverdraftAmount(double amount) {
        this.overdraftAmount = amount;

        if (this.overdraftAmount - amount < 0) {
            this.overdraftAmount = 0.0;
        }

    }

}

public class BankAccount {
    double balance;
    double overdraftAmount = 100;

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && (this.balance + this.overdraftAmount) - amount >= 0) {
            this.balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setOverdraftAmount(double amount) {
        this.overdraftAmount = amount;

        if (this.overdraftAmount - amount < 0) {
            this.overdraftAmount = 0.0;
        }
    }

    public static void main(String[] args) {

    }
}

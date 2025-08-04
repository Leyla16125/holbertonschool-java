import exceptions.InvalidOperationException;

public class BasicBankAccount {
    private String accountNumber;
    private double balance;
    private double annualInterestRate;

    public BasicBankAccount(String accountNumber, double annualInterestRate) {
        this.accountNumber = accountNumber;
        this.annualInterestRate = annualInterestRate;
        this.balance = 0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void deposit(double value) throws InvalidOperationException {
        if (value <= 0) {
            throw new InvalidOperationException("Deposit amount must be greater than 0");
        }
        balance += value;
    }

    public void withdraw(double value) throws InvalidOperationException {
        if (value <= 0) {
            throw new InvalidOperationException("Withdrawal amount must be greater than 0");
        }
        if (value > balance) {
            throw new InvalidOperationException("Withdrawal amount must be less than the current balance");
        }
        balance -= value;
    }

    public double calculateMonthlyFee() {
        return Math.min(10.0, 0.10 * balance);
    }

    public double calculateMonthlyInterest() {
        if (balance < 0) return 0;
        return (annualInterestRate / 12.0 / 100.0) * balance;
    }

    public void applyMonthlyUpdate() {
        balance -= calculateMonthlyFee();
        balance += calculateMonthlyInterest();
    }
}

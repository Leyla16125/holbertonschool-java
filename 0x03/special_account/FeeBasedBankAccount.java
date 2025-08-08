import exceptions.InvalidOperationException;

public class FeeBasedBankAccount extends BasicBankAccount {
    private int transactionCount = 0;
    private static final double TRANSACTION_FEE = 0.10;

    public FeeBasedBankAccount(String accountNumber, double annualInterestRate) {
        super(accountNumber, annualInterestRate);
    }

    @Override
    public void deposit(double value) throws InvalidOperationException {
        super.deposit(value);
        transactionCount++;
        setBalance(getBalance() - TRANSACTION_FEE);
    }

    @Override
    public void withdraw(double value) throws InvalidOperationException {
        super.withdraw(value);
        transactionCount++;
        setBalance(getBalance() - TRANSACTION_FEE);
    }

    public int getTransactionCount() {
        return transactionCount;
    }
}


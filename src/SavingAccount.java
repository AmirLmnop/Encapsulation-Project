public class SavingAccount extends BankAccount{
    private final double interestRate = 3%100 ;

    public SavingAccount(String accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);
    }
    @Override
    public void calculateInterest() {
        deposit(interestRate*balance);
        System.out.println("Account is Saving Account");
    }
}
public class TransactionAccount extends BankAccount{

    private double overDraftLimit = 500;

    public TransactionAccount(String accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);
    }
    @Override
    public void calculateInterest() {
        System.out.println("No interest");
    }
    @Override
    public void withdraw(double amount) {
        if(amount < 0 || amount > balance + overDraftLimit || amount > balance) {
            System.out.println("Invalid amount");
        }
        else {
            balance -= amount;
            System.out.println(amount + " withdrawn from account");
        }
    }
}
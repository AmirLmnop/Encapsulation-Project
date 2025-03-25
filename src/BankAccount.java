public abstract class BankAccount {
    final private String accountNumber;
    private String accountHolderName;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    public abstract void calculateInterest();
    public void deposit(double amount) {
        if(amount >= 0) {
            balance += amount;
            System.out.println(amount + " deposited to the balance");
        }
        else {
            System.out.println("Invalid amount");
        }
    }
    public void withdraw(double amount) {
        if(amount >= 0 && amount <= balance ) {
            balance -= amount;
            System.out.println(amount + " withdrawn from the balance");
        }
        else {
            System.out.println("Invalid amount");
        }
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public double getBalance() {
        return balance;
    }
}
import java.util.ArrayList;

public class BankCustomers {
    private ArrayList <BankAccount> accountsList = new ArrayList<>();

    public  void addAccount(BankAccount account) {
        accountsList.add(account);
    }

    public void showAllBalances() {
        for (BankAccount account : accountsList) {
            System.out.println(account.getAccountHolderName() + "  " + account.getAccountNumber() + "  " + account.getBalance());
        }

    }
    public BankAccount findAccount(String accountNumber) {
        for (BankAccount account : accountsList) {
            if (account.getAccountNumber().equals(accountNumber)) {
                System.out.println(account.getAccountHolderName() + "  " + account.getAccountNumber());
                return account;

            }
        }
        System.out.println("Account Does Not Exist");
        return null;
    }
}
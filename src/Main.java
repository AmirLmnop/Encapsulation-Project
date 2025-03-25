public class Main {
    public static void main(String[] args) {

        BankCustomers bank = new BankCustomers();

        SavingAccount savingAccount1 = new SavingAccount("100" , "A" , 500);
        SavingAccount savingAccount2 = new SavingAccount("200" , "B" , 500);
        SavingAccount savingAccount3 = new SavingAccount("300" , "C" , 500);
        TransactionAccount transactionAccount1 = new TransactionAccount("101" , "D" , 500);
        TransactionAccount transactionAccount2 = new TransactionAccount("202" , "E" , 500);
        TransactionAccount transactionAccount3 = new TransactionAccount("303" , "F" , 500);

        bank.addAccount(savingAccount1);
        bank.addAccount(savingAccount2);
        bank.addAccount(savingAccount3);
        bank.addAccount(transactionAccount1);
        bank.addAccount(transactionAccount2);
        bank.addAccount(transactionAccount3);

        bank.findAccount("100");
        bank.findAccount("304");

        System.out.println(savingAccount1.getBalance());
        savingAccount1.deposit(500);
        System.out.println(savingAccount1.getBalance());

        savingAccount2.deposit(-50);

        transactionAccount3.calculateInterest();
        savingAccount3.calculateInterest();
        System.out.println(transactionAccount3.getBalance());
        System.out.println(savingAccount3.getBalance());

        savingAccount1.withdraw(50);
        savingAccount1.withdraw(-50);
        savingAccount1.withdraw(5000);
        savingAccount2.withdraw(50);
        savingAccount2.withdraw(-50);
        savingAccount2.withdraw(5000);
        savingAccount3.withdraw(50);
        savingAccount3.withdraw(-50);
        savingAccount3.withdraw(5000);

        transactionAccount1.withdraw(50);
        transactionAccount1.withdraw(-50);
        transactionAccount1.withdraw(5000);
        transactionAccount2.withdraw(50);
        transactionAccount2.withdraw(-50);
        transactionAccount2.withdraw(5000);
        transactionAccount3.withdraw(50);
        transactionAccount3.withdraw(-50);
        transactionAccount3.withdraw(5000);

        bank.showAllBalances();
    }
}
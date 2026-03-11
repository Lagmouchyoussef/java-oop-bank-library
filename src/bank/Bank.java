package bank;

public class Bank {
    private BankAccount[] accounts;
    private int numberOfAccounts;

    public Bank(int maxSize) {
        accounts = new BankAccount[maxSize];
        numberOfAccounts = 0;
    }

    public void addAccount(BankAccount account) {
        if (numberOfAccounts < accounts.length) {
            accounts[numberOfAccounts] = account;
            numberOfAccounts++;
            System.out.println("Account added");
        } else {
            System.out.println("No more space");
        }
    }

    public BankAccount searchAccountByNumber(int number) {
        for (int i = 0; i < numberOfAccounts; i++) {
            if (accounts[i].getAccountNumber() == number) {
                return accounts[i];
            }
        }
        return null;
    }

    public void displayAllAccounts() {
        System.out.println("=== ALL ACCOUNTS ===");
        if (numberOfAccounts == 0) {
            System.out.println("No account");
        } else {
            for (int i = 0; i < numberOfAccounts; i++) {
                accounts[i].displayDetails();
            }
        }
    }
}
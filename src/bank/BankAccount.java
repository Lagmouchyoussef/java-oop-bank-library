package bank;

public class BankAccount {
    private int accountNumber;
    private String holder;
    private double balance;

    public BankAccount(int accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit of " + amount + "€ made. New balance: " + balance + "€");
        } else {
            System.out.println("The amount must be positive");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance = balance - amount;
                System.out.println("Withdrawal of " + amount + "€ made. New balance: " + balance + "€");
            } else {
                System.out.println("Insufficient balance. You have " + balance + "€");
            }
        } else {
            System.out.println("The amount must be positive");
        }
    }

    public void displayDetails() {
        System.out.println("Number: " + accountNumber);
        System.out.println("Holder: " + holder);
        System.out.println("Balance: " + balance + "€");
        System.out.println("---------------");
    }
}
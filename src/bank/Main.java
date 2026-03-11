package bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank(10);
        int choice;

        System.out.println("WELCOME TO THE BANK");

        do {
            System.out.println("");
            System.out.println("1. Add an account");
            System.out.println("2. View all accounts");
            System.out.println("3. Search for an account");
            System.out.println("4. Deposit money");
            System.out.println("5. Withdraw money");
            System.out.println("6. Quit");
            System.out.print("Choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.println("");
                System.out.println("ADD AN ACCOUNT");
                System.out.print("Number: ");
                int num = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Balance: ");
                double balance = scanner.nextDouble();
                scanner.nextLine();

                BankAccount c = new BankAccount(num, name, balance);
                bank.addAccount(c);
            }

            else if (choice == 2) {
                System.out.println("");
                bank.displayAllAccounts();
            }

            else if (choice == 3) {
                System.out.println("");
                System.out.println("SEARCH FOR AN ACCOUNT");
                System.out.print("Number: ");
                int num = scanner.nextInt();
                scanner.nextLine();

                BankAccount c = bank.searchAccountByNumber(num);
                if (c != null) {
                    c.displayDetails();
                } else {
                    System.out.println("Account not found");
                }
            }

            else if (choice == 4) {
                System.out.println("");
                System.out.println("DEPOSIT");
                System.out.print("Account number: ");
                int num = scanner.nextInt();
                scanner.nextLine();

                BankAccount c = bank.searchAccountByNumber(num);
                if (c != null) {
                    System.out.print("Amount to deposit: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();
                    c.deposit(amount);
                } else {
                    System.out.println("Account not found");
                }
            }

            else if (choice == 5) {
                System.out.println("");
                System.out.println("WITHDRAW");
                System.out.print("Account number: ");
                int num = scanner.nextInt();
                scanner.nextLine();

                BankAccount c = bank.searchAccountByNumber(num);
                if (c != null) {
                    System.out.print("Amount to withdraw: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();
                    c.withdraw(amount);
                } else {
                    System.out.println("Account not found");
                }
            }

            else if (choice == 6) {
                System.out.println("Goodbye");
            }

            else {
                System.out.println("Invalid choice");
            }

        } while (choice != 6);

        scanner.close();
    }
}
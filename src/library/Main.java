package library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library(10, 5);
        int choice;

        System.out.println("=== WELCOME TO THE LIBRARY ===");

        do {
            // Display menu
            System.out.println("\n MAIN MENU ");
            System.out.println("1. Add a book");
            System.out.println("2. Add a borrower");
            System.out.println("3. Display all books");
            System.out.println("4. Display all borrowers");
            System.out.println("5. Borrow a book");
            System.out.println("6. Return a book");
            System.out.println("7. Quit");
            System.out.print("Your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addBook(scanner, library);
                    break;

                case 2:
                    addBorrower(scanner, library);
                    break;

                case 3:
                    library.displayBooks();
                    break;

                case 4:
                    library.displayBorrowers();
                    break;

                case 5:
                    borrowBook(scanner, library);
                    break;

                case 6:
                    returnBook(scanner, library);
                    break;

                case 7:
                    System.out.println(" Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 7);

        scanner.close();
    }

    public static void addBook(Scanner scanner, Library library) {
        System.out.println("\n--- ADD A BOOK ---");
        System.out.print("Title: ");
        String title = scanner.nextLine();
        System.out.print("Author: ");
        String author = scanner.nextLine();
        System.out.print("Publication year: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        Book newBook = new Book(title, author, year);
        library.addBook(newBook);
    }

    public static void addBorrower(Scanner scanner, Library library) {
        System.out.println("\n--- ADD A BORROWER ---");
        System.out.print("Last name: ");
        String lastName = scanner.nextLine();
        System.out.print("First name: ");
        String firstName = scanner.nextLine();
        System.out.print("ID (number): ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Borrower newBorrower = new Borrower(lastName, firstName, id);
        library.addBorrower(newBorrower);
    }

    public static void borrowBook(Scanner scanner, Library library) {
        System.out.println("\n--- BORROW A BOOK ---");

        if (library.getNumberOfBorrowers() == 0) {
            System.out.println("Add a borrower first!");
            return;
        }

        library.displayBorrowers();
        System.out.print("Enter the borrower's ID: ");
        int borrowerId = scanner.nextInt();
        scanner.nextLine();

        Borrower borrower = library.findBorrowerById(borrowerId);
        if (borrower == null) {
            System.out.println("Borrower not found!");
            return;
        }

        System.out.println("\nAvailable books:");
        boolean atLeastOneAvailable = false;
        for (int i = 0; i < library.getNumberOfBooks(); i++) {
            Book book = library.getBookAtIndex(i);
            if (book.isAvailable()) {
                System.out.println("- " + book.getTitle());
                atLeastOneAvailable = true;
            }
        }

        if (!atLeastOneAvailable) {
            System.out.println("No book available at the moment.");
            return;
        }

        System.out.print("Enter the title of the book to borrow: ");
        String borrowTitle = scanner.nextLine();

        Book bookToBorrow = library.findBookByTitle(borrowTitle);
        if (bookToBorrow == null) {
            System.out.println("Book not found!");
        } else {
            borrower.borrowBook(bookToBorrow);
        }
    }

    public static void returnBook(Scanner scanner, Library library) {
        System.out.println("\n--- RETURN A BOOK ---");

        System.out.print("Enter the borrower's ID: ");
        int returnId = scanner.nextInt();
        scanner.nextLine();

        Borrower returnBorrower = library.findBorrowerById(returnId);
        if (returnBorrower == null) {
            System.out.println("Borrower not found!");
            return;
        }

        System.out.print("Enter the title of the book to return: ");
        String returnTitle = scanner.nextLine();

        Book returnBook = library.findBookByTitle(returnTitle);
        if (returnBook == null) {
            System.out.println("Book not found!");
        } else {
            returnBorrower.returnBook(returnBook);
        }
    }
}
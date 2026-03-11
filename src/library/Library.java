package library;

public class Library {
    private Book[] listOfBooks;
    private Borrower[] listOfBorrowers;
    private int numberOfBooks;
    private int numberOfBorrowers;

    public Library(int maxBooks, int maxBorrowers) {
        this.listOfBooks = new Book[maxBooks];
        this.listOfBorrowers = new Borrower[maxBorrowers];
        this.numberOfBooks = 0;
        this.numberOfBorrowers = 0;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public int getNumberOfBorrowers() {
        return numberOfBorrowers;
    }

    public void addBook(Book book) {
        if (numberOfBooks < listOfBooks.length) {
            listOfBooks[numberOfBooks] = book;
            numberOfBooks++;
            System.out.println(" Book added!");
        } else {
            System.out.println(" Library full!");
        }
    }

    public void addBorrower(Borrower borrower) {
        if (numberOfBorrowers < listOfBorrowers.length) {
            listOfBorrowers[numberOfBorrowers] = borrower;
            numberOfBorrowers++;
            System.out.println(" Borrower added!");
        } else {
            System.out.println(" No more space for borrowers!");
        }
    }

    public void displayBooks() {
        System.out.println("\n LIST OF BOOKS ");
        if (numberOfBooks == 0) {
            System.out.println("No books in the library.");
        } else {
            for (int i = 0; i < numberOfBooks; i++) {
                System.out.print((i+1) + ". ");
                listOfBooks[i].displayBookInfo();
            }
        }
    }

    public void displayBorrowers() {
        System.out.println("\n👤 LIST OF BORROWERS 👤");
        if (numberOfBorrowers == 0) {
            System.out.println("No borrower.");
        } else {
            for (int i = 0; i < numberOfBorrowers; i++) {
                System.out.print((i+1) + ". ");
                listOfBorrowers[i].displayBorrowerInfo();
            }
        }
    }

    public Book findBookByTitle(String title) {
        for (int i = 0; i < numberOfBooks; i++) {
            if (listOfBooks[i].getTitle().equalsIgnoreCase(title)) {
                return listOfBooks[i];
            }
        }
        return null;
    }

    public Borrower findBorrowerById(int id) {
        for (int i = 0; i < numberOfBorrowers; i++) {
            if (listOfBorrowers[i].getBorrowerId() == id) {
                return listOfBorrowers[i];
            }
        }
        return null;
    }

    public Book getBookAtIndex(int index) {
        if (index >= 0 && index < numberOfBooks) {
            return listOfBooks[index];
        }
        return null;
    }
}
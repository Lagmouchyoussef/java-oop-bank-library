package library;

public class Borrower {
    private String lastName;
    private String firstName;
    private int borrowerId;

    public Borrower(String lastName, String firstName, int borrowerId) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.borrowerId = borrowerId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getBorrowerId() {
        return borrowerId;
    }

    public void setBorrowerId(int borrowerId) {
        this.borrowerId = borrowerId;
    }

    public void displayBorrowerInfo() {
        System.out.println("ID: " + borrowerId);
        System.out.println("Last name: " + lastName);
        System.out.println("First name: " + firstName);
        System.out.println("------------------------");
    }

    public void borrowBook(Book book) {
        System.out.println("\n" + firstName + " " + lastName + " wants to borrow:");
        book.borrowBook();
    }

    public void returnBook(Book book) {
        System.out.println("\n" + firstName + " " + lastName + " wants to return:");
        book.returnBook();
    }
}
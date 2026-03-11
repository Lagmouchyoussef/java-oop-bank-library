package library;

public class Book {
    private String title;
    private String author;
    private int yearOfPublication;
    private boolean available;

    public Book(String title, String author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + yearOfPublication);
        System.out.println("Available: " + (available ? "Yes" : "No"));
        System.out.println("------------------------");
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println(" Book \"" + title + "\" borrowed successfully!");
        } else {
            System.out.println(" Book \"" + title + "\" is not available.");
        }
    }

    public void returnBook() {
        if (!available) {
            available = true;
            System.out.println(" Book \"" + title + "\" returned successfully!");
        } else {
            System.out.println(" This book was already available.");
        }
    }
}
public class Book {

    private String title;
    private String author;
    private int pageCount;
    private boolean available;

    public Book(String title, String author, int pageCount, boolean available) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.available = available;
    }

    public void printInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pageCount);
        System.out.println("Available: " + available);
    }

    public void borrow() {
        if (available) {
            available = false;
            System.out.println("You borrowed: " + title);
        } else {
            System.out.println("Book is not available");
        }
    }

    public void returnBook() {
        available = true;
        System.out.println("You returned: " + title);
    }

    public boolean isAvailable() {
        return available;
    }

    public String getTitle() {
        return title;
    }
}
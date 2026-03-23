public class Reader {

    private String firstName;
    private String lastName;
    private int cardNumber;
    private int borrowedCount;

    public Reader(String firstName, String lastName, int cardNumber, int borrowedCount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cardNumber = cardNumber;
        this.borrowedCount = borrowedCount;
    }

    public void printData() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Card number: " + cardNumber);
        System.out.println("Borrowed books: " + borrowedCount);
    }

    public void increaseBorrowedCount() {
        borrowedCount++;
        System.out.println(firstName + " borrowed a book");
    }

    public void decreaseBorrowedCount() {
        if (borrowedCount > 0) {
            borrowedCount--;
            System.out.println(firstName + " returned a book");
        } else {
            System.out.println("No books to return");
        }
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.borrow();
            borrowedCount++;
            System.out.println(firstName + " took book: " + book.getTitle());
        } else {
            System.out.println("Book is not available");
        }
    }

    public void returnBook(Book book) {
        book.returnBook();
        if (borrowedCount > 0) {
            borrowedCount--;
        }
        System.out.println(firstName + " returned book: " + book.getTitle());
    }
}

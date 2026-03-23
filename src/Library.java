public class Library {

    private Book[] books;
    private int bookCount;

    // конструктор
    public Library(int capacity) {
        books = new Book[capacity];
        bookCount = 0;
    }

    // добавить книгу
    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
            System.out.println("Book added: " + book.getTitle());
        } else {
            System.out.println("Library is full");
        }
    }

    // вывести доступные книги
    public void printAvailableBooks() {
        System.out.println("Available books:");
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable()) {
                books[i].printInfo();
                System.out.println();
            }
        }
    }

    // найти книгу по названию
    public Book findBookByTitle(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equals(title)) {
                return books[i];
            }
        }
        return null;
    }

    // посчитать доступные книги
    public int countAvailableBooks() {
        int count = 0;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable()) {
                count++;
            }
        }
        return count;
    }
public void borrowBook(String title, Reader reader) {
    for (int i = 0; i < bookCount; i++) {
        if (books[i].getTitle().equals(title)) {

            if (books[i].isAvailable()) {
                books[i].borrow();
                reader.increaseBorrowedCount();
                System.out.println(reader + " borrowed " + title);
            } else {
                System.out.println("Book is not available");
            }
            return;
        }
    }
    System.out.println("Book not found");
}
public void returnBook(String title, Reader reader) {
    for (int i = 0; i < bookCount; i++) {
        if (books[i].getTitle().equals(title)) {

            books[i].returnBook();
            reader.decreaseBorrowedCount();
            System.out.println(reader + " returned " + title);
            return;
        }
    }
    System.out.println("Book not found");
}
}
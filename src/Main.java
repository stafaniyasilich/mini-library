public class Main {
    public static void main(String[] args) {

        // 📚 создаём книги
        Book b1 = new Book("1984", "Orwell", 300, true);
        Book b2 = new Book("Harry Potter", "Rowling", 500, true);
        Book b3 = new Book("Hobbit", "Tolkien", 250, false);

        // 👤 создаём читателя
        Reader r1 = new Reader("Ivan", "Ivanov", 101, 0);

        // 📦 создаём библиотеку
        Library library = new Library(5);

        // ➕ добавляем книги
        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        // 📖 показать доступные
        System.out.println("\nAvailable before:");
        library.printAvailableBooks();

        // 📥 взять книгу
        library.borrowBook("1984", r1);

        // 📖 после взятия
        System.out.println("\nAfter borrowing:");
        library.printAvailableBooks();

        // 📤 вернуть книгу
        library.returnBook("1984", r1);

        // 📖 после возврата
        System.out.println("\nAfter return:");
        library.printAvailableBooks();
    }
}
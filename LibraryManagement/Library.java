import java.util.ArrayList;

/**
 * Represents a library that manages a collection of books.
 */
public class Library {

    private ArrayList<Book> books;

    /**
     * Constructor to initialize the library's book list.
     */
    public Library() {
        this.books = new ArrayList<>();
    }

    /**
     * Adds a new book to the library.
     *
     * @param book the book to add
     */
    public void addBook(Book book) {
        if (book != null) {
            books.add(book);
        }
    }

    /**
     * Lists all books in the library that are currently available.
     */
    public void listAvailableBooks() {
        System.out.println("\n=== Available Books ===");
        for (Book book : books) {
            if (book.isAvailable()) {
                book.displayInfo();
            }
        }
        System.out.println("========================");
    }

    /**
     * Borrows a book by its ID if it's available.
     *
     * @param bookId the ID of the book to borrow
     */
    public void borrowBook(int bookId) {
        Book book = findBookById(bookId);
        if (book != null && book.isAvailable()) {
            book.setAvailable(false);
            System.out.println("Book borrowed: " + book.getTitle());
        } else {
            System.out.println("The book is unavailable or does not exist.");
        }
    }

    /**
     * Borrows a book by its ID if it's available and adds it to the user's borrowed
     * books.
     *
     * @param bookId the ID of the book to borrow
     * @param user   the user borrowing the book
     */
    public void borrowBook(int bookId, User user) {
        Book book = findBookById(bookId);
        if (book != null && book.isAvailable()) {
            book.setAvailable(false);
            user.addBorrowedBook(book); // Add to user's borrowed books
            System.out.println("Book borrowed: " + book.getTitle());
        } else {
            System.out.println("The book is unavailable or does not exist.");
        }
    }

    /**
     * Returns a book by its ID.
     *
     * @param bookId the ID of the book to return
     */
    public void returnBook(int bookId) {
        Book book = findBookById(bookId);
        if (book != null) {
            if (!book.isAvailable()) {
                book.setAvailable(true);
                System.out.println("The book has been returned: " + book.getTitle());
            } else {
                System.out.println("The book was already available.");
            }
        } else {
            System.out.println("The book does not exist in the library.");
        }
    }

    /**
     * Returns a book by its ID and removes it from the user's borrowed books.
     *
     * @param bookId the ID of the book to return
     * @param user   the user returning the book
     */
    public void returnBook(int bookId, User user) {
        Book book = findBookById(bookId);
        if (book != null && !book.isAvailable() && user.hasBorrowedBook(book)) {
            book.setAvailable(true);
            user.removeBorrowedBook(book); // Remove from user's borrowed books
            System.out.println("The book has been returned: " + book.getTitle());
        } else {
            System.out.println("The book was not borrowed by this user or does not exist.");
        }
    }

    /**
     * Finds a book by its ID.
     *
     * @param bookId the ID of the book to find
     * @return the book if found, otherwise null
     */
    private Book findBookById(int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId) {
                return book;
            }
        }
        return null;
    }
}

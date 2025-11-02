import java.util.ArrayList;


public class Library {

    private ArrayList<Book> books;


    public Library() {
        this.books = new ArrayList<>();
    }


    public void addBook(Book book) {
        if (book != null) {
            books.add(book);
        }
    }

    public void listAvailableBooks() {
        System.out.println("\n=== Available Books ===");
        for (Book book : books) {
            if (book.isAvailable()) {
                book.displayInfo();
            }
        }
        System.out.println("========================");
    }


    public void borrowBook(int bookId) {
        Book book = findBookById(bookId);
        if (book != null && book.isAvailable()) {
            book.setAvailable(false);
            System.out.println("Book borrowed: " + book.getTitle());
        } else {
            System.out.println("The book is unavailable or does not exist.");
        }
    }


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


    public void returnBook(int bookId, User user) {
        Book book = findBookById(bookId);
        if (book != null && !book.isAvailable() && user.hasBorrowedBook(book)) {
            book.setAvailable(true);
            user.removeBorrowedBook(book); 
            System.out.println("The book has been returned: " + book.getTitle());
        } else {
            System.out.println("The book was not borrowed by this user or does not exist.");
        }
    }


    private Book findBookById(int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId) {
                return book;
            }
        }
        return null;
    }
}

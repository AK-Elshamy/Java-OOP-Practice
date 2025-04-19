import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void listAvailableBooks() {
        for (Book book : books) {
            if (book.isAvailable()) {
                book.displayInfo();
            }
        }
    }

    public void borrowBook(int bookId) {
        for (Book book : books) {
            if (bookId == book.getId() && book.isAvailable()) {
                book.setAvailable(false);
                System.out.println("Book borrowed: " + book.gitTitle());
                return;
            }
        }
        System.out.println("The book is unavailable or does not exist.");
    }

    public void returnBook(int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId) {
                book.setAvailable(true);
                System.out.println("The book has been returned: " + book.gitTitle());
                return;
            }
        }
        System.out.println("The book is not available or has already been returned.");
    }

}
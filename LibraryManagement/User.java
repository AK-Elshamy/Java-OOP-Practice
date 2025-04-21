import java.util.HashSet;
import java.util.Set;

/**
 * Represents a user who can borrow and return books from the library.
 * Each user is uniquely identified by their ID.
 */
public class User {

    private int id; // Unique ID to identify each user
    private String name; // Name of the user

    // Set is used to store unique borrowed books (no duplicates)
    private Set<Book> borrowedBooks;

    /**
     * Constructor to initialize a user with an ID and name.
     * 
     * @param id   the user ID
     * @param name the user name
     */
    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.borrowedBooks = new HashSet<>();
    }

    /**
     * Gets the ID of the user.
     *
     * @return the user's ID
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the name of the user.
     *
     * @return the user's name
     */
    public String getName() {
        return name;
    }

    /**
     * Allows the user to borrow a book if it's available.
     * 
     * @param book the book to borrow
     */
    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false); // mark as borrowed
            borrowedBooks.add(book); // add to borrowed set
            book.borrowMessage(name); // Call borrow message from Book class
        } else {
            System.out.println("The book is not available: " + book.getTitle());
        }
    }

    /**
     * Allows the user to return a book they borrowed.
     * 
     * @param book the book to return
     */
    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book); // remove from borrowed set
            book.setAvailable(true); // mark as available
            book.returnMessage(name); // Call return message from Book class
        } else {
            System.out.println(name + " did not borrow this book: " + book.getTitle());
        }
    }

    /**
     * Adds a book to the user's borrowed books set.
     * 
     * @param book the book to add
     */
    public void addBorrowedBook(Book book) {
        borrowedBooks.add(book);
    }

    /**
     * Removes a book from the user's borrowed books set.
     * 
     * @param book the book to remove
     */
    public void removeBorrowedBook(Book book) {
        borrowedBooks.remove(book);
    }

    /**
     * Checks if the user has borrowed a specific book.
     * 
     * @param book the book to check
     * @return true if the user has borrowed the book, false otherwise
     */
    public boolean hasBorrowedBook(Book book) {
        return borrowedBooks.contains(book);
    }

    /**
     * Checks if two User objects are equal based on their ID.
     *
     * @param obj the object to compare with
     * @return true if both users have the same ID, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        // If both references point to the same object in memory, they are equal
        if (this == obj)
            return true;

        // If the other object is null or not of the same class, they are not equal
        if (obj == null || getClass() != obj.getClass())
            return false;

        // Cast the object to User to access its fields
        User user = (User) obj;

        // Two users are considered equal if their IDs match
        return this.id == user.id;
    }

    /**
     * Generates a hash code based on the user's ID.
     * This ensures that two equal users (by ID) have the same hash code,
     * which is required when storing objects in hash-based collections like HashSet
     * or HashMap.
     *
     * @return the hash code for the user
     */
    @Override
    public int hashCode() {
        // Use Java's built-in hash function for integers
        return Integer.hashCode(id);
    }
}

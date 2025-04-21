/**
 * Represents a book in the library system.
 * Contains information about the book's ID, title, author, and availability
 * status.
 */
public class Book {
    private int id;
    private String title;
    private String author;
    private boolean isAvailable;

    /**
     * Constructor to initialize a new book with an ID, title, and author.
     * The book is initially set to be available.
     *
     * @param id     the unique ID of the book
     * @param title  the title of the book
     * @param author the author of the book
     */
    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = true; // Default availability is true
    }

    /**
     * Gets the ID of the book.
     *
     * @return the book's ID
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the title of the book.
     *
     * @return the title of the book
     */
    public String getTitle() {
        return title;
    }

    /**
     * Checks if the book is currently available.
     *
     * @return true if the book is available, false otherwise
     */
    public boolean isAvailable() {
        return this.isAvailable;
    }

    /**
     * Sets the availability status of the book.
     *
     * @param status the new availability status
     */
    public void setAvailable(boolean status) {
        this.isAvailable = status;
    }

    /**
     * Displays detailed information about the book.
     */
    public void displayInfo() {
        System.out
                .println("ID: " + id + " | Title: " + title + " | Author: " + author + " | Available: " + isAvailable);
    }

    /**
     * Prints a message when the book is borrowed.
     *
     * @param userName the name of the user borrowing the book
     */
    public void borrowMessage(String userName) {
        System.out.println(userName + " borrowed the book: " + title);
    }

    /**
     * Prints a message when the book is returned.
     *
     * @param userName the name of the user returning the book
     */
    public void returnMessage(String userName) {
        System.out.println(userName + " returned the book: " + title);
    }

    /**
     * Checks if two Book objects are equal based on their ID.
     * This is important when using collections like HashSet or HashMap,
     * where uniqueness is determined by equals() and hashCode().
     *
     * @param obj the object to compare with
     * @return true if both books have the same ID, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        // If both references point to the same object in memory, they are equal
        if (this == obj)
            return true;

        // If the other object is null or not of the same class, they are not equal
        if (obj == null || getClass() != obj.getClass())
            return false;

        // Cast the object to Book so we can access its fields
        Book book = (Book) obj;

        // Two books are considered equal if their IDs match
        return this.id == book.id;
    }

    /**
     * Generates a hash code based on the book's ID.
     * This ensures that two equal books (by ID) have the same hash code,
     * which is required when storing objects in hash-based collections like HashSet
     * or HashMap.
     *
     * @return the hash code for the book
     */
    @Override
    public int hashCode() {
        // Use Java's built-in hash function for integers
        return Integer.hashCode(id);
    }
}

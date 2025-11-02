import java.util.HashSet;
import java.util.Set;


public class User {

    private int id; 
    private String name; 

   
    private Set<Book> borrowedBooks;

 
    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.borrowedBooks = new HashSet<>();
    }

 
    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

  
    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false); 
            borrowedBooks.add(book); 
            book.borrowMessage(name);
        } else {
            System.out.println("The book is not available: " + book.getTitle());
        }
    }

 
    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.setAvailable(true); 
            book.returnMessage(name);
        } else {
            System.out.println(name + " did not borrow this book: " + book.getTitle());
        }
    }


    public void addBorrowedBook(Book book) {
        borrowedBooks.add(book);
    }


    public void removeBorrowedBook(Book book) {
        borrowedBooks.remove(book);
    }


    public boolean hasBorrowedBook(Book book) {
        return borrowedBooks.contains(book);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        User user = (User) obj;

        return this.id == user.id;
    }

 
    @Override
    public int hashCode() {
        // Use Java's built-in hash function for integers
        return Integer.hashCode(id);
    }
}

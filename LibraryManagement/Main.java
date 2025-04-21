public class Main {
    public static void main(String[] args) {
        // Initialize the library
        Library library = new Library();

        // Add books to the library
        library.addBook(new Book(4820, "Les Misérables", "Victor Hugo"));
        library.addBook(new Book(3710, "The Little Prince", "Antoine de Saint-Exupéry"));
        library.addBook(new Book(9801, "Harry Potter and the Sorcerer's Stone", "J.K. Rowling"));
        library.addBook(new Book(5001, "1984", "George Orwell"));
        library.addBook(new Book(6022, "The Catcher in the Rye", "J.D. Salinger"));

        // Create users
        User user1 = new User(1, "Ahmed");
        User user2 = new User(2, "Abdulrahman");
        User user3 = new User(3, "Homz");

        // Display initial available books
        System.out.println("Initial available books:");
        library.listAvailableBooks();

        // Borrow and return books
        performAction(library, user1, 4820, true); // Ahmed borrows 'Les Misérables'
        performAction(library, user2, 4820, true); // Abdulrahman tries to borrow 'Les Misérables'
        performAction(library, user3, 5001, true); // Homz borrows '1984'

        System.out.println("\nAvailable books after borrowing:");
        library.listAvailableBooks();

        performAction(library, user1, 4820, false); // Ahmed returns 'Les Misérables'
        performAction(library, user3, 5001, false); // Homz returns '1984'

        System.out.println("\nAvailable books after returning:");
        library.listAvailableBooks();

        performAction(library, user2, 3710, true); // Abdulrahman borrows 'The Little Prince'
        performAction(library, user1, 9801, true); // Ahmed borrows 'Harry Potter'

        System.out.println("\nAvailable books after final borrowing:");
        library.listAvailableBooks();
    }

    private static void performAction(Library library, User user, int bookId, boolean isBorrowing) {
        String action = isBorrowing ? "borrows" : "returns";
        System.out.println("\n" + user.getName() + " " + action + " book with ID: " + bookId);
        if (isBorrowing) {
            library.borrowBook(bookId, user);
        } else {
            library.returnBook(bookId, user);
        }
    }
}

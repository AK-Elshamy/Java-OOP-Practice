
public class Book {
    private int id;
    private String title;
    private String author;
    private boolean isAvailable;

    
    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = true; 
    }


    public int getId() {
        return id;
    }

 
    public String getTitle() {
        return title;
    }

    
    public boolean isAvailable() {
        return this.isAvailable;
    }

   
    public void setAvailable(boolean status) {
        this.isAvailable = status;
    }

    
    public void displayInfo() {
        System.out
                .println("ID: " + id + " | Title: " + title + " | Author: " + author + " | Available: " + isAvailable);
    }


    public void borrowMessage(String userName) {
        System.out.println(userName + " borrowed the book: " + title);
    }

 
    public void returnMessage(String userName) {
        System.out.println(userName + " returned the book: " + title);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Book book = (Book) obj;

        return this.id == book.id;
    }


 
    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}

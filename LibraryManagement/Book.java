public class Book {
    private int id;
    private String title;
    private String author;
    private boolean isAvailable;

    Book(int id, String title, String author) {
        this.title = title;
        this.author = author;
        this.id = id;
        this.isAvailable = true;
    }

    public int getId() {
        return id;
    }

    public String gitTitle() {
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

}
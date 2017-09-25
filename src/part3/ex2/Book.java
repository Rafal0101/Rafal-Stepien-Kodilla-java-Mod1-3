package part3.ex2;

/**
 * Created by User on 2017-08-16.
 */
public class Book {
    private String author;
    private String title;
    private int year;

    // constructor with arguments
    public Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    // toString method used for printout the object
    public String toString() {
        return "Title: \"" + title + "\", author: " + author + ", (" + year + ")";
    }

    // getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
}

package part3.ex5_2;

/**
 * Created by User on 2017-08-17.
 */
public class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int hashCode() {
         return author.hashCode() + title.hashCode();
    }

    public boolean equals(Object o) {
        if (o instanceof Book) {
            Book book = (Book) o;
            return author.equals(book.getAuthor()) && title.equals(book.getTitle());
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}

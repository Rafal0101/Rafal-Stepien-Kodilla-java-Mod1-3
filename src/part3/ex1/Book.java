package part3.ex1;

/**
 * Created by User on 2017-08-16.
 */
public class Book {
    private String author;
    private String name;
    private Integer publicationYear;

    public Book(String author, String name, int publicationYear) {
        this.author = author;
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String toString() {
        return "Author: " + author + ", Name: " + name + ", Publication year: " + publicationYear + "      " + this.hashCode();
    }

    public int hashCode() {
        return publicationYear * 100 + author.hashCode() + name.hashCode();
    }

    public boolean equals(Object o) {
        if (o instanceof Book) {
            Book b = (Book) o;
            return (author.equals(b.getAuthor())) && (name.equals(b.getName())) && (publicationYear.equals(b.getPublicationYear()));
        } else {
            return false;
        }
    }
}


package part2.ex5;

/**
 * Created by User on 2017-08-09.
 */
public class Book {
    private String title;
    private Integer year;

    public Book(String title, Integer year) {
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }
}

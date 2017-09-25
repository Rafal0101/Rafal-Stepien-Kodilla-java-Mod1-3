package part3.ex5_3;

import java.util.Random;

/**
 * Created by User on 2017-08-22.
 */
public class BookCreator {
    public static Book createRandomBook() {
        String pattern = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvw‌​xyz";
        String author = "";
        String title = "";

        Random random = new Random();

        while (author.length() < 40) {
            author += pattern.charAt(random.nextInt(pattern.length()));
        }
        while (title.length() < 50) {
            title += pattern.charAt(random.nextInt(pattern.length()));
        }

        Book book = new Book(author, title);
        return book;
    }
}

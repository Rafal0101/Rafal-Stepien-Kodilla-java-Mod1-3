package part3.ex5_2;

import java.util.LinkedList;

/**
 * Created by User on 2017-08-17.
 */
public class Kodilla352 {
    public static void main(String[] args) {
        LinkedList<Book> myBooksList = new LinkedList<>();
        long result = 0;

        for (int i = 0; i < 1000; i++) {
            myBooksList.add(BookCreator.createRandomBook());
        }

        RemoveFirstListElement removeFirstListElement = new RemoveFirstListElement(myBooksList);
        removeFirstListElement.execute();

        RemoveLastListElement removeLastListElement = new RemoveLastListElement(myBooksList);
        removeLastListElement.execute();

        AddFirstListElement addFirstListElement = new AddFirstListElement(myBooksList);
        addFirstListElement.execute();

        AddLastListElement addLastListElement = new AddLastListElement(myBooksList);
        addLastListElement.execute();

        /*
        HashMap<Integer, Book> myBooksMap = new HashMap<>();

        for (int i = 0; i < 1000; i++) {
            myBooksMap.put(i, BookCreator.createRandomBook());
        }
        */
    }
}

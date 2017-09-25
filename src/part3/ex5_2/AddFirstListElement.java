package part3.ex5_2;

import java.util.LinkedList;

/**
 * Created by User on 2017-08-22.
 */
public class AddFirstListElement extends TimeCounter{
    private final LinkedList<Book> items;

    public AddFirstListElement(LinkedList<Book> items) {
        this.items = items;
    }

    protected void operation() {
        items.add(0, BookCreator.createRandomBook());
    }

    protected String operationName() {
        return "Adding first list element";
    }
}

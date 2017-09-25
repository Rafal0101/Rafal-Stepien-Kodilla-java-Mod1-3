package part3.ex5_2;

import java.util.LinkedList;

/**
 * Created by User on 2017-08-22.
 */
public class RemoveFirstListElement extends TimeCounter {
    private final LinkedList<Book> items;

    public RemoveFirstListElement(LinkedList<Book> items) {
        this.items = items;
    }

    protected void operation() {
        items.remove(0);
    }

    protected String operationName() {
        return "Removing first list element";
    }
}

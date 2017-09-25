package part3.ex5_2;

import java.util.LinkedList;

/**
 * Created by User on 2017-08-22.
 */
public class RemoveLastListElement extends TimeCounter{
    private final LinkedList<Book> items;

    public RemoveLastListElement(LinkedList<Book> items) {
        this.items = items;
    }

    protected void operation() {
        items.remove(items.size() - 1);
    }

    protected String operationName() {
        return "Removing last list element";
    }
}

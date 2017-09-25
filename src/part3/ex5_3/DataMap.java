package part3.ex5_3;

import java.util.HashMap;

public class DataMap implements Visitable{
    private final HashMap<Integer, Book> items;
    private final int element;

    public DataMap(HashMap<Integer, Book> items, int element) {
        this.items = items;
        this.element = element;
    }

    public HashMap<Integer, Book> getItems() {
        return items;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this, element);
    }
}

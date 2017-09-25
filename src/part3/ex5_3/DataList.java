package part3.ex5_3;

import java.util.ArrayList;
import java.util.List;

public class DataList implements Visitable {
    private final List<Book> items;
    private final int element;

    public DataList(List<Book> items, int element) {
        this.items = items;
        this.element = element;
    }

    public List<Book> getItems() {
        return items;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this, element);
    }
}

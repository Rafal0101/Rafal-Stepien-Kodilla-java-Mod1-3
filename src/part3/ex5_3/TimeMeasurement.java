package part3.ex5_3;

import java.util.HashMap;
import java.util.List;

public class TimeMeasurement implements Visitor {
    @Override
    public void visit(DataList list, int element) {
        long begin = System.nanoTime();
        List<Book> items = list.getItems();
        items.add(element, BookCreator.createRandomBook());
        long end = System.nanoTime();
        System.out.println(items.getClass().getSimpleName() + " add time element " + element + ":" + (end - begin));
    }

    @Override
    public void visit(DataMap map, int element) {
        long begin = System.nanoTime();
        HashMap<Integer, Book> items = map.getItems();
        items.put(element, BookCreator.createRandomBook());
        long end = System.nanoTime();
        System.out.println("Map time:" + (end - begin));
    }
}

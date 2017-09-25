package part3.ex5_3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

public class Kodilla353 {
    public static void main(String[] args) {
        // Create sample DATA below

        ArrayList<Book> myBooksArrayList = new ArrayList<>();
        LinkedList<Book> myBooksLinkedList = new LinkedList<>();
        HashMap<Integer, Book> myBooksMap = new HashMap<>();


        for (int i = 0; i < 10000; i++) {
            myBooksArrayList.add(BookCreator.createRandomBook());
            myBooksLinkedList.add(BookCreator.createRandomBook());
            myBooksMap.put(i, BookCreator.createRandomBook());
        }

        TimeMeasurement timeMeasurement = new TimeMeasurement();

        DataList dataListElement = new DataList(myBooksArrayList, 0);
        dataListElement.accept(timeMeasurement);
        dataListElement = new DataList(myBooksArrayList, myBooksArrayList.size() - 1);
        dataListElement.accept(timeMeasurement);

        DataList dataLinkedListElement = new DataList(myBooksLinkedList, 0);
        dataLinkedListElement.accept(timeMeasurement);
        dataLinkedListElement = new DataList(myBooksLinkedList, myBooksLinkedList.size() - 1);
        dataLinkedListElement.accept(timeMeasurement);






        DataMap dataMap = new DataMap(myBooksMap, 0);

        dataMap.accept(timeMeasurement);
    }
}

package part3.ex5_1;

/**
 * Created by User on 2017-08-22.
 */
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;

class Kodilla351 {
	    public static void main(String[] args) {
	       LinkedList<Book> myBooksList = new LinkedList<>();
	       long result = 0;

        	for (int i = 0; i < 100000; i++) {
            	myBooksList.add(createRandomBook());
        	}

	        result = removingElementFromListTîme(myBooksList, 0);
    	    System.out.println("Removing first list element time:" + result + " ns");
        	result = removingElementFromListTîme(myBooksList, myBooksList.size() - 1);
        	System.out.println("Removing last list element time:" + result + " ns");
        	result = addingElementToListTime(myBooksList, 0);
        	System.out.println("Adding first list element time:" + result + " ns");
        	result = addingElementToListTime(myBooksList, myBooksList.size() - 1);
        	System.out.println("Adding last list element time:" + result + " ns");

        	HashMap<Integer, Book> myBooksMap = new HashMap<>();

        	for (int i = 0; i < 100000; i++) {
            	myBooksMap.put(i, createRandomBook());
        	}

	        result = removingElementFromMapTime(myBooksMap, 0);
			System.out.println("\nRemoving first map element time:" + result + " ns");
        	result = removingElementFromMapTime(myBooksMap, myBooksMap.size() - 1);
        	System.out.println("Removing last map element time:" + result + " ns");
        	result = addingElementToMapTime(myBooksMap, 0);
        	System.out.println("Adding first map element time:" + result + " ns");
        	result = addingElementToMapTime(myBooksMap, myBooksMap.size() - 1);
        	System.out.println("Adding last map element time:" + result + " ns");

	        result = searchingElementInMapTime(myBooksMap, 0);
    	    System.out.println("\nSearching first element in map time:" + result + " ns");
        	result = searchingElementInMapTime(myBooksMap, myBooksMap.size() / 2);
	        System.out.println("Searching middle element in map time:" + result + " ns");
    	    result = searchingElementInMapTime(myBooksMap, myBooksMap.size() - 1);
        	System.out.println("Searching last element in map time:" + result + " ns");
    }

    private static long addingElementToListTime(LinkedList<Book> books, int element) {
        long begin = System.nanoTime();
        books.add(element, createRandomBook());
        long end = System.nanoTime();
        return (end - begin);
    }

    private static long removingElementFromListTîme(LinkedList<Book> books, int element) {
        long begin = System.nanoTime();
        books.remove(element);
        long end = System.nanoTime();
        return (end - begin);
    }

    private static long addingElementToMapTime(HashMap<Integer, Book> books, int element) {
        long begin = System.nanoTime();
        books.put(element, createRandomBook());
        long end = System.nanoTime();
        return (end - begin);
    }

    private static long removingElementFromMapTime(HashMap<Integer, Book> books, int element) {
        long begin = System.nanoTime();
        books.remove(element);
        long end = System.nanoTime();
        return (end - begin);
    }

    private static long searchingElementInMapTime(HashMap<Integer, Book> books, int element) {
        long begin = System.nanoTime();
        books.get(element);
        long end = System.nanoTime();
        return (end - begin);
    }

    private static Book createRandomBook() {
        String pattern = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
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

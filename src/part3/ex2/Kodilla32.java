package part3.ex2;

import java.util.ArrayDeque;


/**
 Zadanie: Książki na stos!
 Przy użyciu wewnętrzengo edytora Kodilli napisz program, który:

 tworzy stos i umieszcza w nim pięć obiektów typu Book (możesz użyć klasy Book z przykładu),
 sprawdza rozmiar stosu,
 następnie usuwa wszystkie książki
 i ponownie sprawdza rozmiar stosu.
 Program powinien wyświetlić również, która książka została usunięta ze stosu jako ostatnia.
 */

public class Kodilla32 {
    public static void main(String[] args) {

        ArrayDeque<Book> myBooks = new ArrayDeque<>();

        myBooks.offer(new Book("Steven King", "Cell", 2006));
        myBooks.offer(new Book("Arthur Conan Doyle", "The Adventure of the Yellow Face", 1893));
        myBooks.offer(new Book("Zbigniew Nienacki", "Golden glove", 1979));
        myBooks.offer(new Book("Steven King", "Under the dome", 2009));
        myBooks.offer(new Book("Dan Brown", "Origin", 2017));

        System.out.println("In the stack are " + myBooks.size() + " objects");

        Book lastBook = null;
        for (Book book : myBooks) {
            lastBook = myBooks.poll();
        }

        System.out.println(myBooks.isEmpty() ? "There is 0 objects in my stack" : "Something went wrong and some objects still exists");
        System.out.println("The last book was: " + lastBook);
    }
}

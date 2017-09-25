package part3.ex1;

import java.util.HashSet;

/**
 Zadanie: Filtrowanie zbioru książek
 Przy użyciu wewnętrznego edytora Kodilla napisz program, który będzie przechowywał w zbiorze HashSet zestaw kilku obiektów reprezentujących książki.
 Każda książka powinna mieć tytuł, autora i rok wydania
 nie zapomnij również o zdefiniowaniu metod hashCode() oraz equals() dla swoich książek.
 Następnie, przy pomocy poznanej w poprzednim module pętli for-each wyświetl w oknie konsoli tytuły wszystkich książek znajdujących się w zbiorze, które zostały wydane przed 2010 rokiem.
 */

public class Kodilla31 {
    public static void main(String[] args) {
        String x = "21";
        String y = "12";
        boolean v = x.equals(y);

        HashSet<Book> myBooks = new HashSet<>();
        myBooks.add(new Book("Steven King", "Cell", 2006));
        myBooks.add(new Book("Arthur Conan Doyle", "The Adventure of the Yellow Face", 1893));
        myBooks.add(new Book("Zbigniew Nienacki", "Golden glove", 1979));
        myBooks.add(new Book("Steven King", "Under the dome", 2009));
        myBooks.add(new Book("Steven King", "Cell", 2006));
        myBooks.add(new Book("Dan Brown", "Origin", 2017));

        for (Book book : myBooks
                ) {
            if (book.getPublicationYear() < 2010) {
                System.out.println(book);
            }
        }
    }
}

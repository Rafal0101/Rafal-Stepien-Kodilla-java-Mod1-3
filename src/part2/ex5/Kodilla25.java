package part2.ex5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;


/**
 * Created by User on 2017-08-09.
 */
//int randomNum = rand.nextInt((max - min) + 1) + min;
public class Kodilla25 {
    public static void main(String[] args) {
        System.out.println("Exercise part one: ArrayList");
        int limitOfGrades = 15;
        countAverageValue(generateStudentGrades(limitOfGrades));

        System.out.println("\nExercise part two: LinkedList");
        int bookOldestYear = 2000;
        displayNewestBooks(fillLibrary(), bookOldestYear);
    }

    private static ArrayList<Integer> generateStudentGrades(int limitOfGrades) {
        Integer studentGrade;
        ArrayList<Integer> studentGrades = new ArrayList<>();
        Random random = new Random();
        System.out.print("Student grades: ");
        for (int i = 0; i < limitOfGrades; i++) {
            studentGrade = random.nextInt(6) + 1;
            studentGrades.add(studentGrade);
            System.out.print(studentGrade + " ");
        }
        return studentGrades;
    }


    private static void countAverageValue(ArrayList<Integer> studentsGrades) {
        System.out.print("\nAfter removing borders values: ");
        double sumListElements = 0;

        Collections.sort(studentsGrades);
        studentsGrades.remove(0);
        studentsGrades.remove(studentsGrades.size() - 1);

        for (int i = 0; i < studentsGrades.size(); i++) {
            sumListElements += studentsGrades.get(i);
            System.out.print(studentsGrades.get(i) + " ");
        }

        System.out.println("\nThe result of: " + sumListElements + "/" + studentsGrades.size() + " is: " + sumListElements / studentsGrades.size());

        /*
        System.out.print("\nAfter removing borders values: ");
        double sumListElements = 0;
        double elementsCounter = 0;
        int minValue = Collections.min(studentsGrades);
        int maxValue = Collections.max(studentsGrades);

        for (int i = 0; i < studentsGrades.size(); i++) {
            if (studentsGrades.get(i) != minValue && studentsGrades.get(i) != maxValue) {
                sumListElements += studentsGrades.get(i);
                elementsCounter++;
                System.out.print(studentsGrades.get(i) + " ");
            }
        }
        System.out.println("\nThe result of: " + sumListElements + "/" + elementsCounter + " is: " + sumListElements / elementsCounter);
        */
    }

    private static LinkedList<Book> fillLibrary() {
        LinkedList<Book> myBooks = new LinkedList<>();
        myBooks.add(new Book("50 shades of Grey", 2002));
        myBooks.add(new Book("Sherlock Holmes", 2006));
        myBooks.add(new Book("The Last Mohikan", 1998));
        myBooks.add(new Book("The infinity", 2000));
        myBooks.add(new Book("Better Call Soul", 1978));
        myBooks.add(new Book("A Journey Into the Earth", 1990));
        return myBooks;
    }

    private static void displayNewestBooks(LinkedList<Book> myBooks, int bookOldestYear) {
        System.out.println("Books from 2000 and newer:");
        for (Book book : myBooks
                ) {
            if (book.getYear() >= bookOldestYear) {
                System.out.println(book.getTitle() + " / " + book.getYear());
            }
        }
    }
}

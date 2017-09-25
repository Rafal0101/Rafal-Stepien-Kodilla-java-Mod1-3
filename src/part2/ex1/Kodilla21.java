package part2.ex1;

import java.util.Random;

/**
 * Created by User on 2017-08-08.
 */
public class Kodilla21 {
    public static void main(String[] args) {
        int numberOfExerciseElements = 20;

        // I want to use numbers from 0 to 100 only.
        int limitOfElement = 100;

        countAverageValue(generateRandomTable(numberOfExerciseElements, limitOfElement));
    }

    private static int[] generateRandomTable(int numberOfExerciseElements, int limitOfElement) {
        int randomTable[] = new int[20];
        Random generator = new Random();
        for (int i = 0; i < numberOfExerciseElements; i++) {
            randomTable[i] = generator.nextInt(limitOfElement);
            System.out.println("Element:" + (i + 1) + " = " + randomTable[i]);
        }
        return randomTable;
    }

    private static void countAverageValue(int[] randomTable) {
        double tableLength = randomTable.length;
        double sumTableElements = 0;
        for (int i = 0; i < tableLength; i++) {
            sumTableElements += randomTable[i];
        }
        System.out.println("The result of: " + sumTableElements + "/" + tableLength + " is: " + sumTableElements / tableLength);
    }
}

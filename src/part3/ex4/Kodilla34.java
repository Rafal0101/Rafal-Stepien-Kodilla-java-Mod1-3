package part3.ex4;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by User on 2017-08-17.
 */
public class Kodilla34 {
    public static void main(String[] args) {
        ArrayDeque<String> queueOfALetters = new ArrayDeque<>();

        Random random = new Random();

        while (queueOfALetters.size() < 50) {
            String wordOfA = "";
            for (int i = 0; i < random.nextInt(51) + 1; i++) {
                wordOfA += "a";
            }
            queueOfALetters.offer(wordOfA);
        }


/*
        for (int i = 0; i < 50; i++) {
            String wordOfA = "";
            while (random.nextInt(51) > 0) {
                for (int j = 0; j < wordOfALength; j++) {
                    wordOfA += "a";
                }
                queueOfALetters.offer(wordOfA);
            }
            int wordOfALength = random.nextInt(51);
            if (wordOfALength != 0) {
                for (int j = 0; j < wordOfALength; j++) {
                    wordOfA += "a";
                }
                queueOfALetters.offer(wordOfA);
            } else {
                i--;
            }
        }
*/

        divideLettersQueue(queueOfALetters);
    }

    private static void divideLettersQueue(ArrayDeque<String> temporaryQueue) {
        ArrayList<String> evenList = new ArrayList<>();
        ArrayList<String> oddList = new ArrayList<>();

        for (String word : temporaryQueue) {
            if (word.length() % 2 == 0) {
                evenList.add(word);
            } else {
                oddList.add(word);
            }
        }

        System.out.println("List of \"even\" words: ");
        for (String even : evenList) {
            System.out.printf(even + " ");
        }

        System.out.println("\nList of \"odd\" words: ");
        for (String odd : oddList) {
            System.out.printf(odd + " ");
        }
    }
}

package part3.ex3;

import java.util.Random;

/**
 Zadanie: Wyścigi sum
 Napisz program, który:

 będzie posiadał zmienną int sumaA (zainicjowana z wartością 1000)
 oraz drugą zmienną int SumaB (zainicjowana z wartością 0).
 Pętle while, wewnątrz której losujemy:
 liczbę typu int z zakresu 0-9 i dodawaj ją do zmiennej sumaA oraz
 liczbę typu int z zakresu 0-49 i dodawaj ją do zmiennej sumaB.
 Pętlę wykonuj tak długo, jak długo spełniony jest warunek sumaA > sumaB.

 W każdej iteracji wyświetl numer przebiegu pętli oraz aktualne wartości obu zmiennych.
 */
public class Kodilla33 {
    public static void main(String[] args) {

        int sumA = 1000;
        int sumB = 0;
        Random random = new Random();
        int iteration = 0;
        while (sumA > sumB) {
            sumA += random.nextInt(10);
            sumB += random.nextInt(50);
            iteration++;
            System.out.println("Iteration No. " + iteration + " SumA = " + sumA + " SumB = " + sumB);
        }
    }
}

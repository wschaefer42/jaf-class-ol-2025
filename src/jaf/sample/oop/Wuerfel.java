package jaf.sample.oop;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Wuerfel {
    public void wuerfeln() {
        System.out.println("Wie viele Würfel? ");
        int anzahl = new Scanner(System.in).nextInt();
        var wuerfeln = new int[anzahl];
        var random = new Random();
        for (int i = 0; i < anzahl; i++) {
            wuerfeln[i] = random.nextInt(6) + 1;
        }
        System.out.println("Ergebnis: " + format(wuerfeln));
        LocalDate aktuellesDatum = LocalDate.now();
    }

    private String format(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        new Wuerfel().wuerfeln();
    }
}

package jaf.sample.introduction.getting_started;

import java.util.Scanner;

public class FakultaetBerechner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zahl ein:");
        int n = sc.nextInt();
        if (n < 1) {
            System.out.println("Zahl muss grösser 0 sein.");
            return;
        }
        // n >= 0
        long fakultaet = fakultaet(n);
        System.out.println(fakultaet);
    }

    private static long fakultaet(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

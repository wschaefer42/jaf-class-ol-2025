package jaf.sample.introduction.getting_started;

public class BasicJava {
    public static void main(String[] args) {
        int a = 2, b = 3;
        var c = a + b;
        int d = c % 2;
        int e = c++;
        int f = ++c;
        --c;
        c += 2;
        c /= 2;
        var g = c == 2;
        var h = c > 10 ? 56 : 7;
        var hh = 0;
        if (c > 10) {
            hh = 56;
        } else if (c < 10) {
            hh = 7;
        } else {
            hh = 10;
        }
        switch (hh) {
            case 56:
                System.out.println("hh = 56");
                break;
            case 44:
                System.out.println("hh = 44");
                break;
        }

        // Loop
        // for, for-each, while, do-while
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        for (var i : new int[] { 1, 2, 3 }) {
            System.out.println(i);
        }
        c = 0;
        while(c < 10) {
            c++;
        }
        c = 0;
        while(true) {
            c++;
            if (c > 10) {
                break;
            }
            if (c % 2 == 0) {
                continue;
            }
            System.out.println(c);
        }
        c = 0;
        do {
            c++;
            if (c > 10) {
                break;
            }
            if (c % 2 == 0) {

            }
        } while(c < 10);

        if (c < 10 && c % 2 == 0 || c > 10 && !(c % 2 == 0)) {

        }

        String name = "Werner";
        name = "Manuela";
        if (name.startsWith("W")) {

        }
    }

}

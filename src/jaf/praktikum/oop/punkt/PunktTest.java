package jaf.praktikum.oop.punkt;

public class PunktTest {
    public static void main(String[] args) {
        Punkt p1 = new Punkt(2, 5);
        Punkt p2 = new Punkt(1, 10);
        System.out.println(p1.berechneAbstand(p2));
        p2.bewegePunkt(1, 1);
        System.out.println(p1.berechneAbstand(p2));
        // p1.toString() => Object::toString
        System.out.println(p1);
    }
}

package jaf.praktikum.oop.punkt;

/// ## Punkt
///
/// Welche Eigenschaften zeichnen meinen Punkt aus?
///
///     - x int? double?
///     - y
///
/// Methoden?
///
///     - setter
///     - berechneAbstand
///     - bewegePunkt
public class Punkt {
    private int x;
    private int y;

    public Punkt() {
        this(0, 0);
    }
    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double berechneAbstand(Punkt p) {
        return Math.sqrt( Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
    }

    public void bewegePunkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "x = " + x + " y = " + y;
    }
}

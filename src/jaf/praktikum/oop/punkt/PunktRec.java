package jaf.praktikum.oop.punkt;

public record PunktRec(double x, double y) {
    public double berechneAbstand(PunktRec p) {
        return Math.sqrt( Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
    }
    public PunktRec bewegePunkt(double dx, double dy) {
        return new PunktRec(x + dx, y + dy);
    }
}

package jaf.praktikum.inheritance.formen;

public class RectangleTriangle extends Triangle {
    public RectangleTriangle(double sideA, double sideB) {
        super(sideA, sideB, calculateHypotenuse(sideA, sideB));
    }

    private static double calculateHypotenuse(double sideA, double sideB) {
        return Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
    }

    @Override
    public double area() {
        return (sideA * sideB) / 2;
    }
}

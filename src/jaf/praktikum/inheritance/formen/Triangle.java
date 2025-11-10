package jaf.praktikum.inheritance.formen;

public class Triangle extends Shape {
    protected final double sideA;
    protected final double sideB;
    protected final double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }
}

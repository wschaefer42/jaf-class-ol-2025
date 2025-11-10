package jaf.praktikum.inheritance.flugzeugkreis;

public class Circle {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double isArea() {
        return Math.PI * (radius * radius);
    }

    public double isUmfang() {
        return 2 * Math.PI * radius;
    }
}

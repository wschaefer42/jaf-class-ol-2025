package jaf.theorie.inheritance.graphics;

public class Circle extends Shape {
    private final double radius;

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }

    @Override
    public double isArea() {
        return Math.PI * (radius * radius);
    }

    public double isUmfang() {
        return 2 * Math.PI * radius;
    }
}

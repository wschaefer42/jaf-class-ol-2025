package jaf.theorie.inheritance.graphics;

public class Triangle extends Shape{
    public Triangle(double x, double y) {
        super(x, y);
    }

    @Override
    public void draw() {
        System.out.println("Draw Triangle");
    }

    @Override
    public double isArea() {
        return 0;
    }
}

package jaf.theorie.inheritance.graphics;

public class Rectangle extends Shape {
    private final double width;
    private final double height;

    public Rectangle(double x, double y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
        setId("Rectangle");
    }

    @Override
    public void draw() {
        System.out.println("Draw Rectangle");
    }

    @Override
    public double isArea() {
        return width * height;
    }

    public void rotate(double angle) {

    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}


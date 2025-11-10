package jaf.praktikum.inheritance.formen.controls;

public class RectangleTriangle extends jaf.praktikum.inheritance.formen.RectangleTriangle implements Moveable {
    private Point position;

    public RectangleTriangle(double sideA, double sideB, Point position) {
        super(sideA, sideB);
        this.position = position;
    }

    @Override
    public void move(double x, double y) {
        this.position = new Point(x, y);
    }
}

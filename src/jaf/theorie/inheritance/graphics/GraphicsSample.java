package jaf.theorie.inheritance.graphics;

public class GraphicsSample {
    public static void main(String[] args) {
        var shapes = new Shape[3];
        shapes[0] = new Circle(10, 10, 20);
        shapes[1] = new Rectangle(20, 55, 100, 200);
        shapes[2] = new Triangle(100, 100);
        drawAll(shapes);
    }

    private static void drawAll(Shape[] shapes) {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}

package jaf.theorie.inheritance.graphics;

public abstract class Shape {
    private final XY position;
    private String id;

    protected Shape(double x, double y) {
        this.position = new XY(x, y);
        id = "Shape";
    }

    public XY getPosition() {
        return position;
    }

    protected void setId(String id) {
        this.id = id;
    }

    public abstract void draw();

    public abstract double isArea();
}


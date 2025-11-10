package jaf.praktikum.inheritance.flugzeugkreis;

public class PlaneCircle extends Circle {
    private final double cx;
    private final double cy;

    public PlaneCircle(double cx, double cy, double radius) {
        super(radius);
        this.cx = cx;
        this.cy = cy;
    }

    public boolean isInside(Point pc) {
        return distanceTo(pc) <= getRadius();
    }


    public double distanceTo(Point pc) {
        double dx = cx - pc.x();
        double dy = cy - pc.y();
        return Math.sqrt(dx * dx + dy * dy);
    }
}

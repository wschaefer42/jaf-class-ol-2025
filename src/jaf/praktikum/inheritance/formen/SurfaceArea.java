package jaf.praktikum.inheritance.formen;

public interface SurfaceArea {
    double area();
    default boolean isEmpty() {
        return area() == 0;
    }
}

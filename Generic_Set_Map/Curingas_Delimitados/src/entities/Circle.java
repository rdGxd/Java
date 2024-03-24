package entities;

public class Circle implements Shape {
    private final Double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

   @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}

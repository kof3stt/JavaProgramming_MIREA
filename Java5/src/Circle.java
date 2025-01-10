import java.awt.*;

public class Circle extends Shape{
    protected double radius;

    public Circle() {
        super();
        this.radius = (int) (Math.random() * (200));
    }
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(Color colour, boolean filled, double radius) {
        super(colour, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    String getType() {
        return "Треугольник";
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return (super.toString() + "\n\"Shape: circle, radius: "
                + radius);
    }
}

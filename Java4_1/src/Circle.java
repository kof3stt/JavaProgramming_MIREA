public class Circle extends Shape{
    protected double radius;

    public Circle() {
        super("orange",true);
        this.radius = 10;
    }
    public Circle(double radius) {
        super("orange",true);
        this.radius = radius;
    }

    public Circle(String colour, boolean filled, double radius) {
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

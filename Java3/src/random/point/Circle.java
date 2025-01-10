package random.point;

public class Circle {
    private double radius;
    private Point center;

    public Circle(double r, Point center) {
        this.radius = radius;
        this.center = center;
    }

    public Circle() {
        radius = 100*Math.random();
        center = new Point();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public Point getCenter() {
        return center;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
}

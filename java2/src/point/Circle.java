package point;

public class Circle {
    private double r;
    private Point center;

    public Circle(double r, Point center) {
        this.r = r;
        this.center = center;
    }

    public Circle() {
        r = 5;
        center = new Point(10,25);
    }
}

package random.point;

import java.util.Random;

public class Point {
    private double x;
    private double y;

    public Point() {
        x = 100 * Math.random();
        y = 100 * Math.random();
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

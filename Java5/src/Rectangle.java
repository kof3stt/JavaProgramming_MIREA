import java.awt.*;

public class Rectangle extends Shape{
    protected double width,length;

    public Rectangle() {
        super();
        length = (int) (Math.random() * (200));
        width = (int) (Math.random() * (200));
    }
    public Rectangle(double width, double length) {
        super(new Color(255,100,100),true);
        this.width = width;
        this.length = length;
    }

    public Rectangle(Color colour, boolean filled, double width, double length) {
        super(colour, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    String getType() {
        return "Прямоугольник";
    }

    @Override
    double getArea() {
        return width*length;
    }

    @Override
    double getPerimeter() {
        return 2*width+2*length;
    }

    @Override
    public String toString() {
        return (super.toString() + "\n\"Shape: rectangle, width: "
                + width + " lenght: " + length);
    }
}

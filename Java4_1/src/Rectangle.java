public class Rectangle extends Shape{
    protected double width,length;

    public Rectangle() {
        super("red",true);
        this.width = 10;
        this.length = 20;
    }
    public Rectangle(double width, double length) {
        super("red",true);
        this.width = width;
        this.length = length;
    }

    public Rectangle(String colour, boolean filled, double width, double length) {
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

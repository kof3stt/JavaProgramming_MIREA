import java.awt.*;

abstract public class Shape {
    protected Color colour;
    protected boolean filled;
    protected int x;
    protected int y;
    protected int red;
    protected int green;
    protected int blue;
    public Shape() {
        filled = true;
        x = (int) (Math.random() * (800 - 100)); // генерация случайной позиции по оси X
        y = (int) (Math.random() * (600 - 100)); // генерация случайной позиции по оси Y
        red = (int) (Math.random() * 256); // генерация случайного значения для красного цвета
        green = (int) (Math.random() * 256); // генерация случайного значения для зеленого цвета
        blue = (int) (Math.random() * 256); // генерация случайного значения для синего цвета
        colour = new Color(red, green, blue);
    }

    public Shape(Color colour, boolean filled) {
        this.colour = colour;
        this.filled = filled;
    }

    public Color getColour() {
        return colour;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColour(Color colour) {
        this.colour = colour;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    abstract String getType();
    abstract  double getArea();
    abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "colour='" + colour + '\'' +
                ", filled=" + filled +
                '}';
    }
}
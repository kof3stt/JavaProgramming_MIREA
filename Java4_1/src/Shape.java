abstract public class Shape {
    protected String colour;
    protected boolean filled;

    public Shape() {
        colour = "white";
        filled = true;
    }

    public Shape(String colour, boolean filled) {
        this.colour = colour;
        this.filled = filled;
    }

    public String getColour() {
        return colour;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
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
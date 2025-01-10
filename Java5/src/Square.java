import java.awt.*;

public class Square extends Rectangle{

    public Square() {
        super();
        length = (int) (Math.random() * (200));
        width = length;
    }

    public Square(double side) {
        super(new Color(255,100,100),true,side, side);
    }

    public Square(double side, Color colour, boolean filled) {
        super(colour, filled, side, side);
    }

    public double getSide(){
        return this.length;
    }

    public void setSide(double side){
        this.length = side;
        this.width = side;
    }


    @Override
    String getType() {
        return "Квадрат";
    }

    @Override
    double getArea() {
        return length*length;
    }

    @Override
    double getPerimeter() {
        return 4*length;
    }

    @Override
    public String toString() {
        return (super.toString() + "\n\"Shape: square, side: "
                + this.length);
    }
}

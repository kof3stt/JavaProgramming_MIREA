package ball;

public class Ball {
    private double x = 0.;
    private double y = 0.;
    public Ball(double x,double y)
    {
        this.x = x;
        this.y = y;
    }

    public Ball()
    {
        this.x = 5;
        this.y = 7;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x,double y){
        this.x = x;
        this.y=y;
    }

    public void move(double xDisp, double yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

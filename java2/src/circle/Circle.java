package circle;

public class Circle {
    private float xCenter;
    private float yCenter;
    private float rad;

    public float getxCenter() {
        return xCenter;
    }

    public float getyCenter() {
        return yCenter;
    }

    public float getRad() {
        return rad;
    }

    public void setxCenter(float xCenter) {
        this.xCenter = xCenter;
    }

    public void setyCenter(float yCenter) {
        this.yCenter = yCenter;
    }

    public void setRad(float rad) {
        this.rad = rad;
    }

    public Circle(float xCenter, float yCenter, float rad) {
        this.xCenter = xCenter;
        this.yCenter = yCenter;
        this.rad = rad;
    }

    public double get_square(){
        return Math.PI * Math.pow(rad, 2);
    }

    public double get_perimeter() {
        return 2 * Math.PI * rad;
    }

    public boolean compare(Circle circle) {
        return xCenter == circle.xCenter && yCenter == circle.yCenter && rad == circle.rad;
    }
}

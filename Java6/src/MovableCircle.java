public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int radius, MovablePoint center) {
        this.radius = radius;
        this.center = center;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    public void moveUp(){
        center.y+=center.ySpeed;
    }

    public void moveDown(){
        center.y-=center.ySpeed;
    }

    public void moveLeft(){
        center.x-=center.xSpeed;
    }
    public void moveRight(){
        center.x+=center.xSpeed;
    }
}

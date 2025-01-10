public class MovableRectangle {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    private boolean CheckSpeed(){
        return (topLeft.ySpeed != bottomRight.ySpeed || topLeft.xSpeed != bottomRight.xSpeed);
    }
    public MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    public void moveUp(){
        if (CheckSpeed()){
            return;
        }
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    public void moveDown(){
        if (CheckSpeed()){
            return;
        }
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    public void moveLeft(){
        if (CheckSpeed()){
            return;
        }
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    public void moveRight(){
        if (CheckSpeed()){
            return;
        }
        topLeft.moveRight();
        bottomRight.moveRight();
    }

}

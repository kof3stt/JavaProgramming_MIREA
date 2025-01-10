package ball;
import ball.TestBall;
public class TestBall {
    public static void main(String[] args) {
        Ball b = new Ball(5,7);
        b.setX(0);
        System.out.println(b.toString());
        b.move(10,10);
        System.out.println(b.toString());

    }
}

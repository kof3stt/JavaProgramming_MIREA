import java.awt.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        MovablePoint center = new MovablePoint(0,0,10,10);
        MovableCircle circle = new MovableCircle(5,center);
        circle.moveUp();
    }
}
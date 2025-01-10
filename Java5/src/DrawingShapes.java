import java.awt.Color; // импорт класса Color из пакета java.awt
import java.awt.Graphics; // импорт класса Graphics из пакета java.awt
import java.awt.Graphics2D; // импорт класса Graphics2D из пакета java.awt
import java.awt.Shape; // импорт класса Shape из пакета java.awt
import java.awt.geom.Ellipse2D; // импорт класса Ellipse2D из пакета java.awt.geom
import java.awt.geom.Rectangle2D; // импорт класса Rectangle2D из пакета java.awt.geom
import javax.swing.JFrame; // импорт класса JFrame из пакета javax.swing
import javax.swing.JPanel; // импорт класса JPanel из пакета javax.swing

public class DrawingShapes extends JPanel {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int SHAPE_COUNT = 20;

    public void paintComponent(Graphics g) {
        super.paintComponent(g); // вызов родительского метода paintComponent(Graphics g)
        Graphics2D g2d = (Graphics2D) g;
        for (int i = 0; i < SHAPE_COUNT; i++) {
            int randomNum = 0 + (int)(Math.random() * 3);
            Shape shape = null;
            if (randomNum == 0){
                Rectangle rect = new Rectangle();
                shape = new Rectangle2D.Double(rect.getX(), rect.getY(), rect.getLength(), rect.getWidth());
                g2d.setColor(rect.getColour());
            }
            if (randomNum == 1){
                Circle circ = new Circle();
                shape = new Ellipse2D.Double(circ.getX(), circ.getY(), circ.getRadius(), circ.getRadius());
                g2d.setColor(circ.getColour());
            }
            if (randomNum == 2){
                Square square = new Square();
                shape = new Rectangle2D.Double(square.getX(), square.getY(), square.getSide(), square.getSide());
                g2d.setColor(square.getColour());
            }
            g2d.fill(shape); // отрисовка и закрашивание фигуры на экране
        }

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Drawing Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.setLocationRelativeTo(null); // центрирование окна на экране

        DrawingShapes drawingShapes = new DrawingShapes(); // создание объекта DrawingShapes
        frame.add(drawingShapes); // добавление объекта DrawingShapes в окно JFrame

        frame.setVisible(true); // установка видимости окна
    }
}
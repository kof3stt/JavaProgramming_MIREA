import java.awt.*;
import javax.swing.*;

public class DisplayImage extends JPanel {
    private Image image;

    public DisplayImage(Image image) {
        this.image = image;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
    }

    public static void main(String[] args) {
        String imagePath = args[0];
        Image image = Toolkit.getDefaultToolkit().getImage(imagePath); // Загрузка изображения

        JFrame frame = new JFrame("Picture");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        DisplayImage panel = new DisplayImage(image);
        panel.setPreferredSize(new Dimension(640,640));

        frame.getContentPane().add(panel); //Добавляем панель на контейнер содержимого окна frame.

        frame.pack();
        frame.setVisible(true);
    }
}
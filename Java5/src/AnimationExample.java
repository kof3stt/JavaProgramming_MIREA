
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimationExample extends JPanel implements ActionListener {
    private Timer timer;
    private int currentFrame = 0;
    private int totalFrames = 8; // Общее количество кадров в анимации
    private ImageIcon[] frames;

    public AnimationExample() {
        // Загрузка изображений для анимации
        frames = new ImageIcon[totalFrames];
        for (int i = 0; i < totalFrames; i++) {
            frames[i] = new ImageIcon("C:\\Users\\Влад\\Downloads\\image_part_00"+i+".png");
        }


        // Инициализация таймера для анимации
        int delay = 80; // Задержка между кадрами (в миллисекундах)
        timer = new Timer(delay, this);
        timer.start();
    }
    // последовательная отрисовка компонентов
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (currentFrame < totalFrames) {
            frames[currentFrame].paintIcon(this, g, 0, 0);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        currentFrame = (currentFrame + 1) % totalFrames; // Переход к следующему кадру
        repaint(); // Перерисовываем компонент для отображения нового кадра
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        AnimationExample animationWindow = new AnimationExample();
        frame.add(animationWindow);

        frame.setVisible(true);
    }
}


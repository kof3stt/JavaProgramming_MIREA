import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class GuessNum {
    public static int guessNumber;
    public static int attempts = 0;

    public static void main(String[] args) {
        Random random = new Random();
        guessNumber = random.nextInt(21);

        JFrame frame = new JFrame("Числовая угадайка");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);

        JPanel northPanel = new JPanel();
        northPanel.setBackground(Color.RED);
        northPanel.setPreferredSize(new Dimension(1000, 250));
        northPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в САО");
            }
        });
        frame.getContentPane().add(northPanel, BorderLayout.PAGE_START);

        JPanel westPanel = new JPanel();
        westPanel.setBackground(Color.magenta);
        westPanel.setPreferredSize(new Dimension(200, 500));
        westPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в ЗАО");
            }
        });
        frame.getContentPane().add(westPanel, BorderLayout.LINE_START);

        JPanel southPanel = new JPanel();
        southPanel.setBackground(Color.BLUE);
        southPanel.setPreferredSize(new Dimension(1000, 250));
        southPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать ЮАО");
            }
        });
        frame.getContentPane().add(southPanel, BorderLayout.PAGE_END);

        JPanel eastPanel = new JPanel();
        eastPanel.setBackground(Color.ORANGE);
        eastPanel.setPreferredSize(new Dimension(200, 500));
        eastPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в ВАО");
            }
        });
        frame.getContentPane().add(eastPanel, BorderLayout.LINE_END);

        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(Color.pink);
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.X_AXIS));
        JLabel label = new JLabel("Введите число от 0 до 20: ");
        centerPanel.add(label);
        centerPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в ЦАО");
            }
        });
        frame.getContentPane().add(centerPanel, BorderLayout.CENTER);

        JTextField field = new JTextField();
        field.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar() == KeyEvent.VK_ENTER) {
                    int result = Integer.parseInt(field.getText());
                    if (result < guessNumber) {
                        JOptionPane.showMessageDialog(null, "Ваше число меньше загаданного");
                        attempts++;
                    } else if (result > guessNumber) {
                        JOptionPane.showMessageDialog(null, "Ваше число больше загаданного");
                        attempts++;
                    } else {
                        JOptionPane.showMessageDialog(null, "Победа");
                        System.exit(0);
                    }

                    if (attempts == 3) {
                        JOptionPane.showMessageDialog(null, "Закончились попытки! В следующий раз повезет!\nБыло загадано число " + guessNumber);
                        System.exit(0);
                    }
                }
            }
        });
        field.setMaximumSize(new Dimension(600, 30));
        centerPanel.add(field);

        frame.setVisible(true);
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordChecker {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Проверка пароля");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS)); //менеджер расположения setLayout

        JPanel[] panels = new JPanel[] {
                new JPanel(),
                new JPanel(),
        };
        panels[0].setLayout(new GridLayout(3, 2));
        JLabel[] labels = new JLabel[] {
                new JLabel("Service:"),
                new JLabel("User name:"),
                new JLabel("Password:")
        };
        JTextField[] fields = new JTextField[] {
                new JTextField(),
                new JTextField(),
                new JTextField()
        };
        panels[0].add(labels[0]);
        panels[0].add(fields[0]);
        panels[0].add(labels[1]);
        panels[0].add(fields[1]);
        panels[0].add(labels[2]);
        panels[0].add(fields[2]);

        for (JPanel panel : panels) {
            frame.add(panel);
        }

        for (JTextField field : fields) {
            field.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    if (e.getKeyChar() == KeyEvent.VK_ENTER) {
                        String userName = fields[1].getText();
                        String password = fields[2].getText();
                        checkAll(userName, password);
                    }
                }
            });
        }

        frame.setVisible(true);
    }

    public static void checkAll(String userName, String password) {
        Pattern passwordPattern = Pattern.compile("[0-9a-zA-Z_]{8,}");
        Pattern namePattern = Pattern.compile("^[a-zA-Z0-9]+[a-zA-Z0-9!#$%&'*+\\-/=?^_`{|}~.]*@[a-zA-Z0-9\\-_.]+\\.[a-zA-Z]+$");
        Matcher passwordMatcher = passwordPattern.matcher(password);
        Matcher nameMatcher = namePattern.matcher(userName);
        boolean flag = true;
        if (!passwordMatcher.find()) {
            JOptionPane.showMessageDialog(null, "Некорректный пароль!");
            flag = false;
        }
        if (!nameMatcher.find()) {
            JOptionPane.showMessageDialog(null, "Некорректное имя пользователя!");
            flag = false;
        }

        if (flag) {
            JOptionPane.showMessageDialog(null, "Данные введены верно");
        }
        System.exit(0);
    }
}


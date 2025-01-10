//Представление представляет собой компонент, отвечающий за отображение данных пользователю.
//В Java представление обычно реализуется с использованием графических элементов пользовательского интерфейса (UI), таких как окна, кнопки, текстовые поля и т. д.
//Представление получает данные от модели и отображает их для пользователя.

import javax.swing.*;
import java.awt.*;

public class StudentView { // отображение
    JFrame frame;
    JLabel rollLabel;
    JLabel nameLabel;

    public StudentView() {
        frame = new JFrame("Студент");
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        rollLabel = new JLabel();
        nameLabel = new JLabel();
        panel.add(rollLabel);
        panel.add(nameLabel);
        frame.add(panel);
        panel.setBackground(Color.pink);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void printStudentDetails(Student student) {
        rollLabel.setText(student.getRollNumber() + " ");
        nameLabel.setText(" " + student.getName());
        JOptionPane.showMessageDialog(null, "Данные были успешно обновлены!");
    }
}

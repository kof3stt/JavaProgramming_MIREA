import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdvencedMenu {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Программа с меню");

        frame.setLayout(new BorderLayout());

        JTextArea textArea = new JTextArea();
        frame.add(new JScrollPane(textArea), BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 2));

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("Нажата кнопка 1\n");
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("Нажата кнопка 2\n");
            }
        });

        buttonPanel.add(button1);
        buttonPanel.add(button2);

        frame.add(buttonPanel, BorderLayout.SOUTH);

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("Файл");
        JMenuItem saveMenuItem = new JMenuItem("Сохранить");
        JMenuItem exitMenuItem = new JMenuItem("Выйти");
        fileMenu.add(saveMenuItem);
        fileMenu.add(exitMenuItem);

        // Создаем меню "Правка"
        JMenu editMenu = new JMenu("Правка");
        JMenuItem copyMenuItem = new JMenuItem("Копировать");
        JMenuItem cutMenuItem = new JMenuItem("Вырезать");
        JMenuItem pasteMenuItem = new JMenuItem("Вставить");
        editMenu.add(copyMenuItem);
        editMenu.add(cutMenuItem);
        editMenu.add(pasteMenuItem);

        // Создаем меню "Справка"
        JMenu helpMenu = new JMenu("Справка");

        // Добавляем меню в меню бар
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        // Устанавливаем меню бар в главное окно
        frame.setJMenuBar(menuBar);


        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}


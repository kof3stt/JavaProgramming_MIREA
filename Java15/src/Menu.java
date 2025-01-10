import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener{
    String[] countries = {"Россия","США","Китай","Германия","Франция"};
    JComboBox comboBox = new JComboBox(countries);
    JLabel label = new JLabel();
    Border border = BorderFactory.createLineBorder(Color.BLUE,2);
    public Menu() {
        setLayout(new FlowLayout());
        setSize(600,400);
        setTitle("Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        comboBox.setSelectedIndex(0);
        comboBox.addActionListener(this);
        label.setBorder(border);
        add(comboBox);
        add(label);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboBox){
            JComboBox box = (JComboBox) e.getSource();
            String msg = (String) box.getSelectedItem();
            switch (msg){
                case "Россия":
                    label.setText("Площадь страны - 17 098 246 квадратных км. Население - 146 447 424 человек. ");
                    break;
                case "США":
                    label.setText("Площадь страны - 9 826 675 квадратных км. Население - 337 550 940 человек.");
                    break;
                case "Китай":
                    label.setText("Площадь страны - 9 596 961 квадратных км. Население - 1,411 млрд человек.");
                    break;
                case "Германия":
                    label.setText("Площадь страны - 357 578 квадратных км. Население - 83 809 425 человек.");
                    break;
                case "Франция":
                    label.setText("Площадь страны - 643 801 квадратных км. Население - 68 859 674 человек.");
                    break;
            }
        }

}
    public static void main(String[] args) {
        new Menu();
    }

}
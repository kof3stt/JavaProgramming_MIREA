import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent; //обработка событий
import java.awt.event.ActionListener;

public class FootballMatch extends JFrame {
    private JButton milanButton;
    private JButton madridButton;
    private JLabel resultLabel;
    private JLabel lastScorerLabel;
    private JLabel winnerLabel;
    private int milanScore;
    private int madridScore;
    public FootballMatch() {
        setTitle("Football Match");
        setSize(1000, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 1));
        setLocationRelativeTo(null);
        milanButton = new JButton("AC Milan");
        milanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                updateResultLabel();
                lastScorerLabel.setText("Last Scorer: AC Milan");
                updateWinnerLabel();
            }
        });

        madridButton = new JButton("Real Madrid");
        madridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                updateResultLabel();
                lastScorerLabel.setText("Last Scorer: Real Madrid");
                updateWinnerLabel();
            }
        });

        resultLabel = new JLabel("Result: 0 X 0", SwingConstants.CENTER);
        lastScorerLabel = new JLabel("Last Scorer: N/A", SwingConstants.CENTER);
        winnerLabel = new JLabel("Winner: DRAW", SwingConstants.CENTER);

        add(milanButton);
        add(madridButton);
        add(resultLabel);
        add(lastScorerLabel);
        add(winnerLabel);

        setVisible(true);
    }

    private void updateResultLabel() {
        resultLabel.setText("Result: " + milanScore + " X " + madridScore);
    }

    private void updateWinnerLabel() {
        if (milanScore > madridScore) {
            winnerLabel.setText("Winner: AC Milan");
        } else if (milanScore < madridScore) {
            winnerLabel.setText("Winner: Real Madrid");
        } else {
            winnerLabel.setText("Winner: DRAW");
        }
    }

    public static void main(String[] args) {
        new FootballMatch();
    }
}
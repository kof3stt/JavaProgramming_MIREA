import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calc {
    public static  String convertToPoland(String expression) {
        expression = "0" + expression;
        Stack<Character> stack = new Stack<>();
        Pattern pattern = Pattern.compile(" ");
        Matcher matcher = pattern.matcher(expression);
        expression = matcher.replaceAll("");

        Map<Character, Integer> priorities = new HashMap<>();
        priorities.put('(', 0);
        priorities.put('+', 1);
        priorities.put('-', 1);
        priorities.put('/', 2);
        priorities.put('*', 2);
        StringBuilder result = new StringBuilder();
        for (char c : expression.toCharArray()) {
            if (c == '(') {
                stack.add(c);
            }
            else if (c == ')') {
                while (stack.peek() != '(') {
                    result.append(" ").append(stack.pop());
                }
                stack.pop();
            }
            else if (Character.isDigit(c) || c == '.') {
                result.append(c);
            }
            else {
                result.append(" ");
                if (!stack.isEmpty()) {
                    int previousPriority = priorities.get(stack.peek());
                    int currentPriority = priorities.get(c);
                    while (previousPriority >= currentPriority && !stack.isEmpty()) {
                        result.append(stack.pop()).append(" ");
                        if (!stack.isEmpty())
                            previousPriority = priorities.get(stack.peek());
                    }
                }
                stack.add(c);
            }
        }

        while (!stack.isEmpty()) {
            result.append(" ").append(stack.pop());
        }

        return result.toString();
    }
    public static String calculate(String expression) {
        String result = convertToPoland(expression);
        Pattern pattern = Pattern.compile(" ");
        String[] symbols = pattern.split(result);

        pattern = Pattern.compile("\\d+(\\.\\d+)?");
        Stack<Double> stack = new Stack<>();
        try {
            for (String symbol : symbols) {
                Matcher matcher = pattern.matcher(symbol);
                if (matcher.find()) {
                    stack.add(Double.parseDouble(symbol));
                } else {
                    Double second = stack.pop(), first = stack.pop();
                    switch (symbol) {
                        case "+" -> stack.add(first + second);
                        case "-" -> stack.add(first - second);
                        case "*" -> stack.add(first * second);
                        case "/" -> stack.add(first / second);
                    }
                }
            }

            if (stack.peek() == Math.round(stack.peek())) {
                return Integer.toString((int) Math.round(stack.peek()));
            }
            Formatter formatter = new Formatter(Locale.US);
            return formatter.format("%1$.2f", stack.peek()).toString();

        } catch (EmptyStackException | NullPointerException e) {
            return "";
        }
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Бульбулятор");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("Courier New", Font.ITALIC, 40));
        textArea.setMaximumSize(new Dimension(2000, 100));

        JPanel panel = new JPanel(new GridLayout(4, 4));
        String[] buttons = new String[]{"1", "2", "3", "+",
                "4", "5", "6", "-",
                "7", "8", "9", "*",
                ".", "0", "=", "/"};
        ArrayList<JButton> buttonArrayList = new ArrayList<>();
        for (int i = 0; i < buttons.length; i++) {
            buttonArrayList.add(new JButton(buttons[i]));
            final int finalI = i;
            buttonArrayList.get(i).addActionListener(e -> {
                if (!buttons[finalI].equals("="))
                    textArea.append(buttons[finalI]);
                else {
                    String result = calculate(textArea.getText());
                    textArea.repaint();
                    textArea.setText(result);
                }
            });
            panel.add(buttonArrayList.get(i));
        }
        frame.getContentPane().add(textArea);
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}
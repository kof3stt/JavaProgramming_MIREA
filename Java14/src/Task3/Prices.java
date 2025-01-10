package Task3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Prices {
    public static void main(String[] args) {
        System.out.println(" Введите текст: ");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        Pattern p  = Pattern.compile("( |^)\\d+(\\.\\d{1,2})?\\s?((USD)|(EUR)|(RUB))");
        Matcher m = p.matcher(text);
        while (m.find())
        {
            System.out.println(m.group());
        }
    }
}

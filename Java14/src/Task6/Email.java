package Task6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
    public static void main(String[] args) {
        System.out.println(" Введите email: ");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        Pattern p  = Pattern.compile("^[a-zA-Z0-9]+[a-zA-Z0-9!#$%&'*+\\-/=?^_`{|}~.]*@[a-zA-Z0-9\\-_.]+\\.[a-zA-Z]+$");
        Matcher m = p.matcher(text);
        if (m.find())
        {
            System.out.println(m.group());
        }
    }
}

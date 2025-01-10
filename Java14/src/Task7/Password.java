package Task7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    public static void main(String[] args) {
        System.out.println(" Введите пароль: ");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        Pattern p1  = Pattern.compile("[0-9a-zA-Z_]{8,}");
        Matcher m1 = p1.matcher(text);
        Pattern p2 = Pattern.compile("\\d");
        Matcher m2 = p2.matcher(text);
        Pattern p3 = Pattern.compile("[a-z]");
        Matcher m3 = p3.matcher(text);
        Pattern p4 = Pattern.compile("[A-Z]");
        Matcher m4 = p4.matcher(text);
        if (m1.find() && m2.find() & m3.find() & m4.find())
        {
            System.out.println(m1.group());
        }
        else{
            System.out.println("Bad password");
        }
    }
}

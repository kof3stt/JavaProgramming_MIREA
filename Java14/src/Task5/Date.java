package Task5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Date {
    public static void main(String[] args) {
        System.out.println(" Введите дату в формате dd/mm/yyyy: ");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        Pattern p  = Pattern.compile("^([01]\\d/(01|02|03|04|05|06|07|08|09|10|11|12)/[123456789]\\d{3})|(29/02/((\\d\\d(0[48]|[2468][048]|[13579][26]))|((0[48]|[2468][048]|[3579][26])00)))|((20|21|22|23|24|25|26|27|28)/02/[123456789]\\d{3})|(((2\\d)|30)/(01|03|04|05|06|07|08|09|10|11|12)/[123456789]\\d{3})|(31/(01|03|05|07|08|10|12)/[123456789]\\d{3})$");
        Matcher m = p.matcher(text);
        while (m.find())
        {
            System.out.println(m.group());
        }
    }
}

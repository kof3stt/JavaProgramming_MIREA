package task4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateAndTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Введите год: ");
        int year = sc.nextInt();
        System.out.println(" Введите месяц: ");
        int month = sc.nextInt();
        System.out.println(" Введите день: ");
        int day = sc.nextInt();
        Calendar cal1 = Calendar.getInstance();

        cal1.set(year,month,day);

        Date date1 = new Date(year,month,day);
        //System.out.println(date1.equals(cal1));

        System.out.println(" Введите час: ");
        int hour = sc.nextInt();
        System.out.println(" Введите минуту: ");
        int min = sc.nextInt();

        Calendar cal2 = Calendar.getInstance();
        cal2.set(Calendar.HOUR,hour);
        cal2.set(Calendar.MINUTE,min);
    }
}

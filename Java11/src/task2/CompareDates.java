package task2;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CompareDates {
    public static void main(String[] args) {
        Date today = new Date();
        Scanner sc = new Scanner(System.in);
        System.out.println(" Введите год: ");
        int year = sc.nextInt();
        System.out.println(" Введите месяц: ");
        int month = sc.nextInt();
        System.out.println(" Введите день: ");
        int day = sc.nextInt();
        System.out.println(" Введите час: ");
        int hour = sc.nextInt();
        System.out.println(" Введите минуту: ");
        int min = sc.nextInt();
        System.out.println(" Введите секунду: ");
        int sec = sc.nextInt();
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.YEAR,year);
        calendar.set(Calendar.MONTH,month);
        calendar.set(Calendar.DAY_OF_MONTH,day);
        calendar.set(Calendar.HOUR,hour);
        calendar.set(Calendar.MINUTE,min);
        calendar.set(Calendar.SECOND,sec);
        if (today.after(calendar.getTime())) {
            System.out.println("Введенная дата раньше");
        }

        if (today.before(calendar.getTime())) {
            System.out.println("Введенная дата позже");
        }

        if (today.equals(calendar.getTime())) {
            System.out.println(" Введенная дата и текущая дата совпадают");
        }
    }
}

package Task4;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Digits {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Boolean f = Pattern.compile("\\d+\\s?\\+").matcher(s).find();
        System.out.println(f);
    }
}

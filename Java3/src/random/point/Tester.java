package random.point;

import java.util.Scanner;

public class Tester {
    private static Circle[] circles;
    private static int total;

    public static void main(String[] args) {
        System.out.println("Введите количество окружностей");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        circles = new Circle[n];
        for (int i = 0; i < n;i++){
            circles[i] = new Circle();
            total++;
        }
        output(circles);
        sortSircles(circles);
        System.out.println(" Отсортированный список: ");
        output(circles);
        System.out.println("Lowest is ");
        System.out.println(findLowest());

    }

    public static Circle findLowest(){
        Circle res = circles[0];
        for (int i = 1; i < total; i++) {
            if (circles[i].getRadius() < res.getRadius())
                res = circles[i];
        }
        return res;
    }

    public static Circle findHighest(){
        Circle res = circles[0];
        for (int i = 1; i < total; i++) {
            if (circles[i].getRadius() > res.getRadius())
                res = circles[i];
        }
        return res;
    }

    public static void sortSircles(Circle[] circles) {
        Circle temp;
        for (int i = 0; i < total; i++) {
            for (int j = i; j < total; j++) {
                if (Tester.circles[i].getRadius() > Tester.circles[j].getRadius()) {
                    temp = Tester.circles[j];
                    Tester.circles[j] = Tester.circles[i];
                    Tester.circles[i] = temp;
                }
            }
        }
    }

    public static <circles> void output(Circle[] circles){
        for (int i = 0; i<total;i++){
            System.out.println(circles[i].toString());
        }
    }
}

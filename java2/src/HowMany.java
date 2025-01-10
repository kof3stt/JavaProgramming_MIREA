import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner data = new Scanner(sc.nextLine());
        int total = 0;
        while (sc.hasNext()) {
            sc.next();
            total++;
        }
        System.out.println(total);
    }
}
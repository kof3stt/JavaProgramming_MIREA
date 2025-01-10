import java.util.List;
import java.util.Scanner;
import java.util.Collections;
public class Reversed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Введите количество элементов в массиве: ");
        int n = sc.nextInt();
        String[] data = new String[n];
        for (int i = 0; i<n;i++){
            data[i] = sc.next();
        }
        String temp = "";
        for (int i = 0; i<(n/2);i++){
            temp = data[i];
            data[i] = data[n-i-1];
            data[n-i-1] = temp;

        }
        for (int i = 0; i<n;i++){
            System.out.println(data[i]);
        }
    }
}

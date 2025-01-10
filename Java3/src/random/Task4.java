package random;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println(" Введите число n: ");
        int n = sc.nextInt();
        while (true){
            if (n<=0){
                System.out.println(" Не подхоядщее число!!!");
                n = sc.nextInt();
            }
            else break;
        }
        int k = 0;
        int data[] = new int[n];
        for (int i = 0; i<n;i++){
            data[i] = rand.nextInt(0,n);
            if (data[i]%2==0)
                k++;
        }
        System.out.println(" Рандомный массив:");
        for (int i = 0; i<n;i++){
            System.out.print(data[i]+" ");
        }
        int new_data[] = new int[k];
        k=0;
        for (int i = 0; i < data.length;i++){
            if ((data[i])%2==0)
            {
                new_data[k] = data[i];
                k++;
            }
        }
        System.out.println(" \nРандомный массив с четными элементами:");
        for (int i = 0; i<k;i++){
            System.out.print(new_data[i]+" ");
        }
    }

}

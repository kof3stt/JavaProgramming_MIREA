package random;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = sc.nextInt();
        float data[] = new float[n];
        Random rand = new Random();
        /*
        for (int i = 0; i < n;i++){
            data[i] = rand.nextFloat(100);
        }
        */
        for (int i = 0; i < n;i++){
            data[i] = (float) Math.random();
        }
        System.out.println("Исходный массив: ");
        for (int i = 0; i < n;i++){
            System.out.println(data[i]);
        }
        float temp = 0;
        System.out.println("Отсортированный массив: ");
        for (int i = 0; i<data.length;i++){
            for (int j = i; j < data.length;j++){
                if (data[i] > data[j]){
                    temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
        for (int i = 0; i < n;i++){
            System.out.println(data[i]);
        }
    }
}

package random;

import java.sql.SQLOutput;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int data[] = new int[4];
        Random rand = new Random();
        for (int i = 0; i<4;i++){
            data[i] = rand.nextInt(10,99);
        }

        for (int i = 0; i<4;i++){
            System.out.print(data[i]+" ");
        }
        if (data[0] < data[1] && data[1] < data[2] && data[2] < data[3])
            System.out.println(" Массив является возрастающей последовательностью");
        else{
            System.out.println(" Массив не является возрастающей последовательностью");
        }
    }
}

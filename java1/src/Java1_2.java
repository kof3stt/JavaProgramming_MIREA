import java.util.Scanner;

public class Java1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int total = 0;
        int i =0;
        int []data = new int[size];
        while(i < data.length)
        {
            data[i] = sc.nextInt();
            total += data[i];
            i++;
        }
        int maxi = data[0];
        int mini = data[0];
        i = 0;
        do {
            if (data[i]<mini)
                mini = data[i];
            if (data[i]>maxi)
                maxi = data[i];
            i++;
        } while (i < data.length);
        System.out.printf("Сумма чисел: %1$d, Минимальное:  %2$d, Максимальное:  %3$d",total, mini,maxi);
    }
}

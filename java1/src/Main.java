import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int []data = new int[5];
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 0; i < data.length; i++)
        {
            data[i] = sc.nextInt();
            total += data[i];
        }
        System.out.printf("Сумма чисел: %1$d, Среднее арифметическое:  %2$f", total, (float)total/data.length);
    }
}
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //print();
        reverseNum(12987);
        System.out.println();
        //normalNum(12987);
    }

    public static void print(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n != 0) {
            int m = sc.nextInt();
            System.out.println(n);
            if (m != 0) {
                print();
            }
        }
    }

    public static void normalNum(int n){
        if (n==0)
            return;
        normalNum(n/10);
        System.out.print(n%10+" ");
    }

    public static void reverseNum(int n){
        if (n==0)
            return;
        System.out.print(n%10+" ");
        reverseNum(n/10);
    }
}
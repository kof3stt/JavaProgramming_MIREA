package shop;
import java.util.Scanner;
public class ShopTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите изначальное количество компьютеров в магазине: ");
        int n = sc.nextInt();
        Shop shop = new Shop(n);
        shop.findComputer();
    }
}

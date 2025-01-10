package dog;
import java.util.Scanner;
public class DogTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько dogs необходимо добавить в ПитомникСобак?");
        int n = sc.nextInt();
        PitomnikSobak basa = new PitomnikSobak();
        basa.add_dog(n);
        System.out.println(basa.toString());
    }
}

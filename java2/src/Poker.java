import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        String[] cards = {"Двойка(крести)", "Двойка(червы)", "Двойка(бубны)", "Двойка(пики)",
                "Тройка(крести)", "Тройка(червы)", "Тройка(бубны)", "Тройка(пики)",
                "Четверка(крести)", "Четверка(червы)", "Четверка(бубны)", "Четверка(пики)",
                "Пятерка(крести)", "Пятерка(червы)", "Пятерка(бубны)", "Пятерка(пики)",
                "Шестерка(крести)", "Шестерка(червы)", "Шестерка(бубны)", "Шестерка(пики)",
                "Семерка(крести)", "Семерка(червы)", "Семерка(бубны)", "Семерка(пики)",
                "Восьмерка(крести)", "Восьмерка(червы)", "Восьмерка(бубны)", "Восьмерка(пики)",
                "Девятка(крести)", "Девятка(червы)", "Девятка(бубны)", "Девятка(пики)",
                "Десятка(крести)", "Десятка(червы)", "Десятка(бубны)", "Десятка(пики)",
                "Валет(крести)", "Валет(червы)", "Валет(бубны)", "Валет(пики)",
                "Дама(крести)", "Дама(червы)", "Дама(бубны)", "Дама(пики)",
                "Король(крести)", "Король(червы)", "Король(бубны)", "Король(пики)",
                "Король(крести)", "Король(червы)", "Король(бубны)", "Король(пики)",
                "Туз(крести)", "Туз(червы)", "Туз(бубны)", "Туз(пики)",
        };
        ArrayList <String> new_cards = new ArrayList<>(List.of(cards));
        Collections.shuffle(new_cards);
        Scanner sc = new Scanner(System.in);
        System.out.println(" Введите количество игроков: ");
        int n = sc.nextInt();
        if (n>10)
            System.out.println("Слишком много игроков!");
        else{
            for (int i = 0; i < n; i++){
                for (int j = 0; j<5;j++){
                    System.out.println(new_cards.get(5 * i + j));
                }
                if (i!=n-1)
                    System.out.println("<<<<<<<<<<<<<<<<< Следующий игрок <<<<<<<<<<<<<<<<<<<<<");
            }
        }
    }
}
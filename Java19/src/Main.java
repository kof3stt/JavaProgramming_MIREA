import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер ИНН: ");
        try{
            String inn = sc.nextLine();
            chechInn(inn);
            System.out.println("Корректный ИНН!");
        }
        catch (BadInnException e){
            System.out.println(e.getLocalizedMessage());
        }
    }

    public static boolean chechInn(String inn) throws BadInnException{
        // 973421083286
        if (inn.length() != 12) throw new BadInnException( inn);
        if (!isStringOnlyDigits(inn)) throw new BadInnException( inn);
        int summa1 = 0;
        int controlN1 = 0;
        ArrayList <Integer> total1 = new ArrayList<>();
        total1.add(7);
        total1.add(2);
        total1.add(4);
        total1.add(10);
        total1.add(3);
        total1.add(5);
        total1.add(9);
        total1.add(4);
        total1.add(6);
        total1.add(8);
        total1.add(0);
        for (int i = 0; i < inn.length() -1 ;i ++ ){
            char c = inn.charAt(i);
            int x = Integer.parseInt (String.valueOf(c));
            summa1 += (x * total1.get(i));
        }
        controlN1 = (summa1 - (summa1 /11) * 11);
        if (controlN1 > 9)
            controlN1 = controlN1 % 10;
        total1.clear();
        total1.add(3);
        total1.add(7);
        total1.add(2);
        total1.add(4);
        total1.add(10);
        total1.add(3);
        total1.add(5);
        total1.add(9);
        total1.add(4);
        total1.add(6);
        total1.add(8);
        total1.add(0);
        int summa2 = 0;
        int controlN2 = 0;
        for (int i = 0; i < inn.length() ;i++ ) {
            char c = inn.charAt(i);
            int x = Integer.parseInt(String.valueOf(c));
            summa2 += (x * total1.get(i));
        }
        controlN2 = (summa2 - (summa2 /11) * 11);
        if (controlN2 > 9)
            controlN2 = controlN2 % 10;
        if ((controlN1 != Integer.parseInt (String.valueOf(inn.charAt(10)))) | (controlN2 != Integer.parseInt (String.valueOf(inn.charAt(11))))){
            throw new BadInnException( inn);
        }
        return true;
    }

    public static boolean isStringOnlyDigits(String str) {
        return str.matches("\\d+");
    }


}
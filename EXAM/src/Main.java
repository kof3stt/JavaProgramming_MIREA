
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("ArrayList:");
        ArrayList <Integer> array = new ArrayList<>();
        array.add(10);
        array.add(5);
        array.add(17);
        System.out.println(array.get(0));


        System.out.println("MyArrayList:");
        MyArrayList <Integer> data = new MyArrayList<>();
        data.add(10);
        data.add(5);
        data.add(17);
        System.out.println(data.get(0));
        System.out.println(data);
        data.remove(1);
        System.out.println(data);
        System.out.println(data.isEmpty());
        //System.out.println(data.get(11));
    }
}
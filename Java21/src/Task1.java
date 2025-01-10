import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static List<Object> convertArrayToList(Object[] array) {
        List<Object> list = new ArrayList<>();
        for (Object element : array) {
            list.add(element);
        }

        return list;
    }

    public static void main(String[] args) {
        String[] stringArray = {"apple", "banana", "cherry", "tomato", "5838538"};
        Integer[] intArray = {10, 54, 35, 14, 544};

        List<Object> stringList = convertArrayToList(stringArray);
        List<Object> intList = convertArrayToList(intArray);

        System.out.println("String List: " + stringList);
        System.out.println("Integer List: " + intList);
    }
}

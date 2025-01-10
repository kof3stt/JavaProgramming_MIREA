import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        // "C:\\Users\\Влад\\Documents\\Case Hardened"
        String directoryPath = "C:\\steam";

        List<String> fileList = new ArrayList<>();

        File directory = new File(directoryPath);
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                fileList.add(file.getName());
            }

            System.out.println("Первые 5 элементов каталога:");

            for (int i = 0; i < Math.min(5, fileList.size()); i++) {
                System.out.println(fileList.get(i));
            }
        } else {
            System.out.println("Указанная директория пуста или не существует.");
        }
    }
}
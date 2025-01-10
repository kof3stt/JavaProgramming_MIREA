
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student model = retrieveStudentFromDataBase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите новое имя студента: ");
        String name = scanner.nextLine();
        while (!name.equalsIgnoreCase("stop")) {
            controller.setStudentName(name);
            controller.updateView();
            System.out.println("Введите новое имя студента: ");
            name = scanner.nextLine();
        }
    }

    public static Student retrieveStudentFromDataBase() {
        Student student = new Student();
        student.setName("Вова");
        student.setRollNumber("15ИИТ2023");
        return student;
    }
}
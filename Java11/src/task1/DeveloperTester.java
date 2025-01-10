package task1;

import java.util.Scanner;

public class DeveloperTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Developer python = new Developer();
        System.out.println("Введите ФИО разработчика: ");
        python.setFullName(sc.nextLine());
        System.out.println("Введите зарплату разработчика: ");
        python.setSalary(sc.nextInt());
        System.out.println(" Введите профессию: ");
        python.setProf(sc.next());
        System.out.println("ФИО разработчика: " + python.getFullName() + "\n" + "Зарплата: " + python.getSalary() + "\n"
                + "Должность: " + python.getProf() + "\n" + "Дата получения задания: " + python.getStart() + "\nДата окончания задания: " + python.getFinish());
    }
}

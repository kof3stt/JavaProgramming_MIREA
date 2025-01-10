package task3;

public class StudentsTester {
    public static void main(String[] args) {
        Student Vlad = new Student();
        System.out.println(Vlad.getBirthday());
        System.out.println(Vlad.toString("short"));
        System.out.println(Vlad.toString("mid"));
        System.out.println(Vlad.toString("full"));
    }
}

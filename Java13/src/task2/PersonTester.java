package task2;

public class PersonTester {
    public static void main(String[] args) {
        Person per1 = new Person("Кирилл", "Скоробогатов", "Сергеевич", 25);
        System.out.println(per1.getFio());
        Person per2 = new Person();
        per2.setSurname("Леонидов");
        System.out.println(per2.getFio());
    }
}

package task5;

public class PhoneNumberTester {
    public static void main(String[] args) {
        PhoneNumber n1 = new PhoneNumber("89020444040");
        System.out.println(n1.toString());
        PhoneNumber n2 = new PhoneNumber("+999020444040");
        System.out.println(n2.toString());
        PhoneNumber n3 = new PhoneNumber("+12349020444040");
        System.out.println(n3.toString());
    }
}

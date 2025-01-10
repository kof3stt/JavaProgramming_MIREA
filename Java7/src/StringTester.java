import java.util.Scanner;

public class StringTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stringable MyClass = new MyString();
        String s = sc.nextLine();
        System.out.println(MyClass.len(s));
        System.out.println(MyClass.newStr(s));
        System.out.println(MyClass.reverse(s));
    }
}

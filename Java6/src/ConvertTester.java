public class ConvertTester {
    public static void main(String[] args) {
        Convertable temp = new Fahrenheit(32);
        System.out.println(temp.convert());
    }
}

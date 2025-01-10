import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Exception1 ob1 = new Exception1();
        ob1.exceptionDemo();
        Exception2 ob2 = new Exception2();
        ob2.exceptionDemo();
    }

    public static class Exception1 {
        public void exceptionDemo() {
            try {
                System.out.println(2.0 / 0.0);
            } catch (ArithmeticException e) {
                System.out.println("Attempted division by zero");
            }
        }
    }


    public static class Exception2 {
        public void exceptionDemo() {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            try {
                String intString = myScanner.next();
                int i = Integer.parseInt(intString);
                System.out.println(2 / i);

            }
            catch (Exception e){
                System.out.println("Error");
            }

            finally {
                System.out.println("Program finished");
            }
        }
    }
}

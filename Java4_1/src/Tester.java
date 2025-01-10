// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Tester {
    public static void main(String[] args) {
        Shape ob1 = new Circle(10);
        System.out.println(ob1.getType());
        System.out.println(ob1.getArea());
        Shape ob2 = new Rectangle();
        System.out.println(ob2.getColour());
        Rectangle ob3 = new Square(7);
        System.out.println(ob3.getPerimeter());
        System.out.println(ob2.toString());
        }
    }
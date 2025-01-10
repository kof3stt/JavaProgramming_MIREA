package circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(1,2,5);
        Circle fake = new Circle(1,2,4);
        System.out.printf("Площадь: %f\n", circle.get_square());
        System.out.printf("Периметр: %f\n",circle.get_perimeter());
        System.out.print(circle.compare(fake));
    }
}

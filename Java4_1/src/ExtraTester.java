public class ExtraTester {
    public static void main(String[] args) {

        Shape s1 = new Circle("RED", false, 5.5);
        System.out.println(s1);//which version?
        System.out.println(s1.getArea());// which version?
        System.out.println(s1.getPerimeter());//which version?
        System.out.println(s1.getColour());
        System.out.println(s1.isFilled());
        //System.out.println(s1.getRadius()); нет в суперклассе
        Circle c1 = (Circle)s1;// Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColour());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());
        //Shape s2 = new Shape(); нельзя инициализировать абстрактнным классом
        Shape s3 = new Rectangle("RED", false, 1.0, 2.0);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColour());
        //System.out.println(s3.getLength()); нет в супер классе
        Rectangle r1 = (Rectangle)s3; //downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColour());
        System.out.println(r1.getLength());
        Shape s4 = new Square(6.6);//Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColour());
/*обратите внимание, что выполняем downcast Shape s4 к
Rectangle, который является суперклассом
Square(родителем), вместо Square */
        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2); System.out.println(r2.getArea());
        System.out.println(r2.getColour());
        System.out.println(r2.getLength());
// Downcast Rectangle r2 к Square
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColour());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}

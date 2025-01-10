public class Pants extends Clothes implements MenClothing,WomenClothing{
    public Pants(String size, int price, String colour) {
        super(size, price, colour);
    }


    @Override
    public void dressMen() {
        System.out.println(" Мужская одежда: "+toString());
    }

    @Override
    public void dressWomen() {
        System.out.println(" Женская одежда: "+toString());
    }

    @Override
    public String toString() {
        return "Pants" + super.toString();
    }
}
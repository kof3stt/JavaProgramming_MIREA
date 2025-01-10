public class Skirt extends Clothes implements WomenClothing{
    public Skirt(String size, int price, String colour) {
        super(size, price, colour);
    }

    public void dressMen() {

    }
    @Override
    public void dressWomen() {
        System.out.println(" Женская одежда: "+toString());
    }

    @Override
    public String toString() {
        return "Skirt" + super.toString();
    }
}
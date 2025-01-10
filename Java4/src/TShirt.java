public class TShirt extends Clothes implements MenClothing,WomenClothing{
    public TShirt(String size, int price, String colour) {
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
        return "TShirt" + super.toString();
    }
}

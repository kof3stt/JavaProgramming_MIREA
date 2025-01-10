public class Tie extends Clothes implements MenClothing{
    public Tie(String size, int price, String colour) {
        super(size, price, colour);
    }

    @Override
    public void dressWomen() {
    }
    @Override
    public void dressMen() {
        System.out.println(" Мужская одежда: "+toString());
    }

    @Override
    public String toString() {
        return "Tie" + super.toString();
    }

}
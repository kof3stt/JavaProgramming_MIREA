public abstract class Clothes {
    String size;
    int price;
    String colour;

    public Clothes(String size, int price, String colour) {
        this.size = size;
        this.price = price;
        this.colour = colour;
    }
//    abstract public void dressMen();
//    abstract public void dressWomen();

    @Override
    public String toString() {
        return "Clothes{" +
                "size='" + size + '\'' +
                ", price=" + price +
                ", colour='" + colour + '\'' +
                '}';
    }
}

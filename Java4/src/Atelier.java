public class Atelier {
    public static void main(String[] args) {
        Clothes data[] = {new Pants("M",10000,"black"),new Tie("XS",4000,"white"),
        new Skirt("L",8000,"yellow"), new TShirt("M",5000,"red")};
        for (Clothes item: data){
            if (item instanceof MenClothing){
                ((MenClothing)item).dressMen();
            }
            if (item instanceof WomenClothing){
                ((WomenClothing)item).dressWomen();
            }
        }
    }
}

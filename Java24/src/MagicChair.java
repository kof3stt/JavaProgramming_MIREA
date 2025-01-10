public class MagicChair implements Chair{
    public void doMagic() {
        System.out.println("Стул исчез!");
    }

    @Override
    public String toString() {
        return "MagicChair{}";
    }
}
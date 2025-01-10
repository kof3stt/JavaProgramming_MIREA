public class TestChairFactory {
    public static void main(String[] args) {
        Client client = new Client();
        ChairFactory chairFactory = new ChairFactory();
        Chair chair = chairFactory.createVictorianChair();
        client.setChair(chair);
        client.sit();

        Chair chair2 = chairFactory.createMagicChair();
        client.setChair(chair2);
        client.sit();
    }
}
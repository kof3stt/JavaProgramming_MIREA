public class Client {
    private Chair chair;

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    public void sit() {
        System.out.println("Выбран стул " + chair);
    }
}
public class Fahrenheit implements Convertable{
    int cel;

    public Fahrenheit(int cel) {
        this.cel = cel;
    }

    public int getCel() {
        return cel;
    }

    public void setCel(int cel) {
        this.cel = cel;
    }

    public double convert(){
        return 1.8 * cel+32;
    }
}

public class Kelvin implements Convertable{
    int cel;

    public Kelvin(int cel) {
        this.cel = cel;
    }

    public int getCel() {
        return cel;
    }

    public void setCel(int cel) {
        this.cel = cel;
    }

    public double convert(){
        return cel+273.15;
    }
}

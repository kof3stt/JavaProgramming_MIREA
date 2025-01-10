
public class Main {
    public static void main(String[] args) {
        General <Integer,String,String> gen = new General<>(10,"value","11A256");
        System.out.println(gen.toString());
        System.out.println();
        General <Boolean,Double,String> gena = new General<>(Boolean.FALSE,12.2,"11A256");
        System.out.println(gena.toString());
    }
}
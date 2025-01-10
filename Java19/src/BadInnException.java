public class BadInnException extends Exception{
    public BadInnException(String inn){
        super("ИНН с номером "+ inn + " не действителен!");
    }
}

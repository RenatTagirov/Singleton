package planet;

public class Earth implements Planet{
    private static Earth earth = null;

    private Earth(){}

    public static Earth getEarth(){
        return earth;
    }
}

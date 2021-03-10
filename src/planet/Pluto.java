package planet;

public class Pluto implements Planet{
    private static Pluto pluto = null;

    private Pluto(){}

    public static Pluto getPluto(){
        return pluto;
    }
}

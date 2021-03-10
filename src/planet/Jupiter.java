package planet;

public class Jupiter implements Planet{
    private static Jupiter jupiter = null;

    private Jupiter(){}

    public static Jupiter getJupiter(){
        return jupiter;
    }
}

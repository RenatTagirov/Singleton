package planet;

public class Mars implements Planet{
    private static Mars mars = null;

    private Mars(){}

    public static Mars getMars(){
        return mars;
    }
}

public class EarlyLoading {

    private static final EarlyLoading earlyLoading = new EarlyLoading();

    private EarlyLoading(){

    }

    public static EarlyLoading getInstance(){
        return earlyLoading;
    }
}
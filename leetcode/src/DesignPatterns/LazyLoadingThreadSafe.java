public class LazyLoadingThreadSafe {

    private static volatile LazyLoadingNonThreadSafe instance;

    private LazyLoadingThreadSafe() {
        // private constructor to prevent instantiation
    }

    public static LazyLoadingNonThreadSafe getInstance(){
        if(instance == null){
            synchronized (LazyLoadingNonThreadSafe.class){
                if(instance==null){
                    instance= new LazyLoadingNonThreadSafe();
                }
            }
        }
        return instance;
    }
}
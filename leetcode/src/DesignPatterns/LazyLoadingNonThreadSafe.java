public class LazyLoadingNonThreadSafe {
    private static LazyLoadingNonThreadSafe instance;

    private LazyLoadingNonThreadSafe() {
        // private constructor to prevent instantiation
    }

    public static LazyLoadingNonThreadSafe getInstance(){
        if(instance==null){
            instance=new LazyLoadingNonThreadSafe();
        }
        return instance;
    }
}
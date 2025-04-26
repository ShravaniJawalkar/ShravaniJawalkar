public class LazyLoadingBillPug {

    private LazyLoadingBillPug(){

    }

    private static class LazyLoadingBillPugHolder {
        private static final LazyLoadingBillPug INSTANCE =new LazyLoadingBillPug();
    }

    public static LazyLoadingBillPug getInstance(){
        return LazyLoadingBillPugHolder.INSTANCE;
    }
}
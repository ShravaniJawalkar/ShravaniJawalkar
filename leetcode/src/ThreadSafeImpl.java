import java.util.concurrent.locks.ReentrantLock;

public class ThreadSafeImpl {
    private int increment;
    private ReentrantLock lock=new ReentrantLock();

    public void setIncrement(){
        lock.lock();
        try{
            increment++;
        }catch (Exception e){
            throw e;
        }
    }
}

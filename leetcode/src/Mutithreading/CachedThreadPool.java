package Mutithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {
    public static void main(String[] args) {
        System.out.println("Main thread starts here...");
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(()->{
            for (int i=0;i<5;i++){
                final int task =i;
                System.out.println("<Task-"+task+">" + " is running" + " by " + Thread.currentThread().getName());
            }
        });
        executorService.shutdown();
    }
}

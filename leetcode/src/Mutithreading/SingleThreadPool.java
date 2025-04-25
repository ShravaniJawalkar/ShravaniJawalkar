package Mutithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadPool {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i=0;i<5;i++){
            final int taskNumber = i;
            executorService.execute(()->{
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Task Id "+taskNumber+" Thread name: " + Thread.currentThread().getName());
            });
        }
        System.out.println("Thread name: " + Thread.currentThread().getName());
        executorService.shutdown();
    }
}

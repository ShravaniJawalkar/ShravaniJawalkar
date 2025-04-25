package Mutithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {

    public static void main(String []args){
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i=0;i<5;i++){
            int task =i;
            executorService.submit(()->{
                System.out.println("Task "+task+" is running on thread "+Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            });
            executorService.shutdown();
        }
    }
}

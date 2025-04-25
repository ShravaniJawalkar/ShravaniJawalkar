package Mutithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPool {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
       ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);

        scheduledThreadPool.schedule(()->{
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread: "+Thread.currentThread().getName()+" Task "+i);
            }
        }, 5L, TimeUnit.SECONDS);

        // Execute the task after 2 seconds
        scheduledThreadPool.scheduleAtFixedRate(()->{
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread: "+Thread.currentThread().getName()+" Task "+i);
            }
        }, 1, 3, TimeUnit.SECONDS);

        scheduledThreadPool.scheduleWithFixedDelay(()->{
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread: "+Thread.currentThread().getName()+" Task "+i);
            }
        }, 1, 3, TimeUnit.SECONDS);

        new Thread(()->{
            try {
                Thread.sleep(1000);
                scheduledThreadPool.shutdown();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }).start();
    }
}

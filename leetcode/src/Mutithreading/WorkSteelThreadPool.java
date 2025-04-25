package Mutithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public class WorkSteelThreadPool {
    public static void main(String[] args) {

        ExecutorService workerExecutorService = Executors.newWorkStealingPool(2);
        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            workerExecutorService.execute(() -> {
                System.out.println("Task " + taskId + " executed by " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        workerExecutorService.shutdown();
        try {
            workerExecutorService.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

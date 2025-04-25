package Mutithreading;

import java.util.concurrent.*;

public class CustomThreadPool {
    public static void main(String[] args) {
        ExecutorService service = new ThreadPoolExecutor(2, 3, 60L, TimeUnit.SECONDS, new ArrayBlockingQueue<>(2), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        //ThreadPoolExecutor.AbortPolicy() - Throw the RejectedExecutionException if queue is full and thread reach it's maximum limit and all thread are busy
        //ThreadPoolExecutor.CallerRunsPolicy();- run the task in calling thread
        //ThreadPoolExecutor.DiscardPolicy() :- if thread pool is full and queue is also full then it will discard new incoming task without notice.
        //ThreadPoolExecutor.DiscardOldestPolicy() :- remove the oldest task from the queue

        //Queue
        // new ArrayBlockingQueue<Runnable>(int capacity) - it is of type bounded.
        // new LinkedBlockingDeque<Runnable>() - it is of type unbounded.
        ((ThreadPoolExecutor) service).allowCoreThreadTimeOut(true);
        for (int i = 0; i < 10; i++) {
            int task = i;
            service.submit(() -> {

                System.out.println("Task " + task + " is being executed by " + Thread.currentThread().getName());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        service.shutdown();
    }
}

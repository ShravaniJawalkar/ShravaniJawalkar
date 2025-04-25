package Mutithreading;

import java.util.concurrent.*;

public class MyFutureAndCallable {
    public static void main(String[] args){
        MyCallable myCallable = new MyCallable();
        ExecutorService executorService = new ThreadPoolExecutor(2,4,6L, TimeUnit.SECONDS,new ArrayBlockingQueue<>(2), Executors.defaultThreadFactory(), new ThreadPoolExecutor.CallerRunsPolicy());
        try {
            Future<String> future = executorService.submit(()->myCallable.call());
              Future<String> future1= executorService.submit(()->{
                                        System.out.println("Task 1 is being executed by " + Thread.currentThread().getName());
                                        try {
                                            Thread.sleep(2000);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                        return Thread.currentThread().getName();
                                    });

            System.out.println("Future result status: " + future.isDone());
            System.out.println("Future result: " + future.get());
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
        executorService.shutdown();

    }
}

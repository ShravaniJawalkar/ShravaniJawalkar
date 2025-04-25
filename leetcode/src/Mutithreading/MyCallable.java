package Mutithreading;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("Thread name: " + Thread.currentThread().getName() + " Thread Priority: "+ Thread.currentThread().getPriority());
        return Thread.currentThread().getName();
    }
}

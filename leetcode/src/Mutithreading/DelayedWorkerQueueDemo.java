package Mutithreading;

import java.util.concurrent.TimeUnit;

public class DelayedWorkerQueueDemo {

    public static void main(String args[]) throws InterruptedException {
        DelayedWorkerQueue queue = new DelayedWorkerQueue();
        queue.addTask(new DelayedTask("Task 1", 3L, TimeUnit.SECONDS));
        queue.addTask(new DelayedTask("Task 2", 1L, TimeUnit.SECONDS));
        queue.addTask(new DelayedTask("Task 3", 5L, TimeUnit.SECONDS));
        queue.addTask(new DelayedTask("Task 4", 0L, TimeUnit.SECONDS));

        while (!queue.isEmpty()) {
            DelayedTask task = queue.takeTask();
            if (task != null) {
                task.execute();
            }
        }
    }
}

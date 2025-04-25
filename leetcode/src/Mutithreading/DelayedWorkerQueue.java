package Mutithreading;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

public class DelayedWorkerQueue {

    private final PriorityBlockingQueue<DelayedTask> queue = new PriorityBlockingQueue<>();

    public void addTask(DelayedTask task) {
        queue.offer(task);
    }

    public DelayedTask takeTask() throws InterruptedException {
        while (true){
            DelayedTask task = queue.peek();
            if (task == null) {
                Thread.sleep(100);
                continue;
            }
            long delay = task.getDelay(TimeUnit.MICROSECONDS);  // TimeUnit.NANOSECONDS
            if(delay <= 0){
                return queue.poll();
            }
            Thread.sleep(delay);
        }
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }
}

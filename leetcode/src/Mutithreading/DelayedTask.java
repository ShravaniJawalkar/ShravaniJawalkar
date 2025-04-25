package Mutithreading;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayedTask implements Delayed {
    private final String name;
    private final long executionTime;

    public DelayedTask(String name, long delayTime, TimeUnit unit){
        this.name = name;
        this.executionTime = System.currentTimeMillis() + unit.toMillis(delayTime);
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return unit.convert(executionTime-System.currentTimeMillis(),TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed other) {
        return Long.compare(this.getDelay(TimeUnit.MILLISECONDS),other.getDelay(TimeUnit.MILLISECONDS));
    }
    public void execute(){
        System.out.println("Executing Tasks "+name+" at "+System.currentTimeMillis());
    }
}



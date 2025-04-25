package Mutithreading;

public class InterThreadComm {
    private boolean available = false;

    public void producer() throws InterruptedException{
        while(available){
            wait();
        }
        available = true;
        System.out.println("Producing");
        notify();
    }

    public void consume() throws InterruptedException{
        while(!available){
            wait();
        }
        available= false;
        System.out.println("Consuming");
        notify();
    }
}

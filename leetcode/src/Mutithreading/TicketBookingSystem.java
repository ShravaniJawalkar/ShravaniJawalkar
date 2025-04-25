package Mutithreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class TicketBookingSystem {
    private int availableSeats = 5;
    ReentrantLock lock = new ReentrantLock(true);

    public boolean bookTicket(int passanger) {
        try{
            if(lock.tryLock(2,TimeUnit.SECONDS)){
                try {
                   if(availableSeats >0) {
                       while (passanger > 0 && availableSeats > passanger) {
                           System.out.println("Booking seat for: " + passanger);
                           passanger--;
                           availableSeats--;
                       }
                       return true;
                   }else {
                       System.out.println("No seats available");
                       return false;
                   }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }finally {
                    lock.unlock();
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    public int remainingSeats(){
        return availableSeats;
    }
}

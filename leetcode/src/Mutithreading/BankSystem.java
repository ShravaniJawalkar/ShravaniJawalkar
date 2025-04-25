package Mutithreading;

public class BankSystem {

    public static void main(String[] args){
        SynchronizationMechanism sm= new SynchronizationMechanism();

        Thread r =new Thread(()->{
            sm.deposite(10000L);
           System.out.println("Amount deposited:"+  sm.getAmount());

        });

        Thread s =new Thread(()->{
            sm.withdraw(200L);
            System.out.println("Amount Withdraw:"+  sm.getAmount());
        });

        r.start();
        System.out.println("Thread"+Thread.currentThread().getName());
        s.start();

        TicketBookingSystem tbs = new TicketBookingSystem();
        Runnable task = new Runnable() {
            @Override
            public void run(){
               System.out.println("Ticket Booked: "+tbs.bookTicket(2));
               System.out.println("tickets left: "+tbs.remainingSeats());
            }
        };
        Thread t1 = new Thread(task,"P1");
        Thread t2 = new Thread(task,"P2");
        Thread t3 = new Thread(task,"P3");

        t1.start();
        t2.start();
        t3.start();
    }
}

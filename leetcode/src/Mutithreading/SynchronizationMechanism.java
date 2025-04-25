package Mutithreading;

public class SynchronizationMechanism {

    private long balance=0L;

    public synchronized void withdraw(long amount){
        if(balance> amount)
            balance-=amount;
    }

    public synchronized void deposite(long amount){
        balance+=amount;
    }

    public synchronized long getAmount(){
        return balance;
    }
}

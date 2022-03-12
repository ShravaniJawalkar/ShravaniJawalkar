package javaCore;

public class TestTeam extends Thread{
	public TestTeam(String name) {
		super(name);
	}
	public void run() {
		System.out.println("Testing Team is working"+Thread.currentThread().getName());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("unable to proceed");
		}
		System.out.println("Testing Team is finished working"+Thread.currentThread().getName());
	}
}

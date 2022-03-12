package javaCore;

import java.util.concurrent.CountDownLatch;

public class DevTeam extends Thread {
	private  CountDownLatch countDown;
	public DevTeam(CountDownLatch countDown, String name) {
		super(name);
		this.countDown=countDown;
		
	}
	public void run() {
		System.out.println(Thread.currentThread().getName()+"task assign to Dev Team");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		System.out.println("unable to proceed");
		}
		System.out.println(Thread.currentThread().getName()+"task finished by dev team");
		countDown.countDown();
	}
}

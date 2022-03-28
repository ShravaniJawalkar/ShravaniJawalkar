package com.example.springhiberjavaConfig.entity.java;

public class MemThread extends Thread {
	private long message;

	public MemThread(long l) {
		super();
		this.message = l;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"Thread reciving->"+message );
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"Thread complete execution"+message);
		
	}

}

package com.example.springhiberjavaConfig.entity.java;

import java.util.concurrent.CountDownLatch;

public class CountDountThread extends Thread{
	private CountDownLatch countLatch;



	public CountDountThread(CountDownLatch countLatch,String name) {
		super(name);
		this.countLatch = countLatch;
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+"Team-> working");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"Team-> end work");
	}

}

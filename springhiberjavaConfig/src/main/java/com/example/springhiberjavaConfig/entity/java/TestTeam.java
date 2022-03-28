package com.example.springhiberjavaConfig.entity.java;

public class TestTeam extends Thread {

	public TestTeam(String name) {
		super(name);
	}
	public void run() {
		System.out.println(Thread.currentThread().getName()+"Team");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"Team");
	}
}

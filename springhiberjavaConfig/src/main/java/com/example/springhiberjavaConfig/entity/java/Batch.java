package com.example.springhiberjavaConfig.entity.java;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

interface kept {
	public int sum(int a, int b);
}

final class ImJava {
	public final int a;

	public ImJava(int a) {
		this.a = a;
	}

	public int getA() {
		return a;
	}
}

public class Batch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		kept obj = (int x, int y) -> (x + y);
		System.out.println(obj.sum(1, 2));
		ImJava m = new ImJava(5);
		System.out.println(m.getA());

		Object[] r = Arrays.stream(a).mapToObj(i -> Integer.valueOf(i)).filter(k -> (k % 2 == 0)).distinct().sorted()
				.toArray();

		System.out.println((int) r[r.length - 2]);

		CountDownLatch countDownLatch = new CountDownLatch(2);
		CountDountThread t = new CountDountThread(countDownLatch, "Dev Team1");
		CountDountThread t1 = new CountDountThread(countDownLatch, "Dev Team2");
		t.start();
		t1.start();
		try {
			countDownLatch.await(2000, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		TestTeam tt = new TestTeam("test team1");
		tt.start();

	}

}

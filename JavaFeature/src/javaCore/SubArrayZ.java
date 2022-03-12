package javaCore;

import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Scanner;

public class SubArrayZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] ar = new int[N];
		for (int i = 0; i < N; i++) {
			ar[i] = sc.nextInt();
		}
		Hashtable<Integer, Boolean> s = new Hashtable<Integer, Boolean>();
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			sum += ar[i];

			if (ar[i] == 0 || sum == 0 || s.containsKey(sum))
				s.put(sum, true);
			else
				s.put(sum, false);
		}
		boolean flag = false;
		for (Entry<Integer, Boolean> e : s.entrySet()) {
			if (e.getValue())
				{flag = true;}
		}
		if (flag)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}

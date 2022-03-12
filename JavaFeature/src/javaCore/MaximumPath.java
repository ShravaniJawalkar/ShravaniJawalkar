package javaCore;

import java.util.Scanner;

public class MaximumPath {
	public static void main(String args[]) throws Exception {

		// Write code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a1 = new int[n];
		for (int i = 0; i < n; i++) {
			a1[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] a2 = new int[m];
		for (int i = 0; i < m; i++) {
			a2[i] = sc.nextInt();
		}
		int f = 0, s = 0, result = 0, sum1 = 0, sum2 = 0;
		while (f < n && s < m) {
			if (a1[f] < a2[s])
				sum1 += a1[f++];
			else if (a1[f] > a2[s])
				sum2 += a2[s++];
			else {
				result += Math.max(sum1, sum2) + a1[f];
				sum1 = 0;
				sum2 = 0;

				f++;
				s++;
			}
		}
		while (f < n) {
			sum1 += a1[f++];
		}

		while (s < m) {
			sum2 += a2[s++];
		}

		result += Math.max(sum1, sum2);
		System.out.println(result);
	}
}

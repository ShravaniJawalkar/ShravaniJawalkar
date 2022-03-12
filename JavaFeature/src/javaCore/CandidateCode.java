package javaCore;

import java.util.Scanner;


public class CandidateCode {
	public static void main(String args[]) throws Exception {

		// Write code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		int len = minimumLenSubArray(ar, x, n);

		System.out.println(len);

	}

	private static int minimumLenSubArray(int[] arr, int x, int n) {
		int current_arr = 0, min = n + 1;
		int start = 0, end = 0;
		while (end < n) {
			while (current_arr <= x && end < n)
				current_arr += arr[end++];

			while (current_arr > x && start < n) {
				if ((end - start) < min) {
					min = end - start;
				}

				current_arr -= arr[start++];
			}
		}
		return min;
	}
}

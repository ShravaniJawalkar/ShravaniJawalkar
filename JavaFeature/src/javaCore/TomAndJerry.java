package javaCore;

import java.util.Scanner;

public class TomAndJerry {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int noOfUnit = sc.nextInt();
			int tom = sc.nextInt();
			int jerry = sc.nextInt();
			int result = getTomAndJerryWork(noOfUnit, tom, jerry);
			System.out.println(result);
		}
	}

	private static int getTomAndJerryWork(int noOfUnit, int tom, int jerry) {
		int noOfDays = 0;
		while (noOfUnit > jerry) {
			int tomPro = tom - jerry;
			noOfUnit = noOfUnit - tomPro;
			noOfDays++;
		}

		return noOfDays;

	}

}

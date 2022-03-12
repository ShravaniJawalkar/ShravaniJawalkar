package javaCore;

import java.util.Scanner;

public class NoOfCheetWays {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][]path=new int[n][2];
		for(int i=0;i<n;i++) {
			int c=sc.nextInt();
			int d=sc.nextInt();
			path[i][0]=c;
			path[i][1]=d;
		}
		int k=sc.nextInt();
		int[] first=new int[k];
		for(int j=0;j<k;j++) {
			first[j]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<k;j++ ) {
				if(path[i][0]!=first[j] && path[i][1]!=first[j])
					count++;
			}
		}
		System.out.println(count);
	}

}

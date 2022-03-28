package com.example.springhiberjavaConfig.entity.java;

import java.util.Scanner;

public class QuickSort {
		public static void main(String args[] ) throws Exception {

			//Write code here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0){
		   int N=sc.nextInt();
		   int c1=sc.nextInt();
		   int c2=sc.nextInt();
		   if(N>=1 && N<=100000 && c1>=1 && c1<=100000 && c2>=1 && c2<=100000){
		int ans=minMoney(N,c1,c2);
		   System.out.println(ans);
		   }
		   
		}
		   }
		   public static int minMoney(int N,int c1, int c2){
		      int min=Integer.MAX_VALUE;
		      for(int i=0, j=N;i<=N && j>=0;i++,j--){
		    	  int ans1=(((int)(c1*Math.pow(i,2))+(int)(c2*Math.pow(j,2))));
	    		  int ans2=(((int)(c1*Math.pow(j,2))+(int)(c2*Math.pow(i,2))));
		            min=Math.min(min, Math.min(ans1, ans2)); 
		      }
		      return min;
		   }

}

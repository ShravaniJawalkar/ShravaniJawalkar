package javaCore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MisFortune {
	 public static void main(String args[] ) throws Exception {

		 Scanner sc=new Scanner(System.in);
		 int N=sc.nextInt();
		 int[] ar=new int[N];
		    for(int i=0;i<N;i++){
		         ar[i]=sc.nextInt();
		    }
		    int sum=sc.nextInt();

		int j=0;
		int count=0;
		List<Integer> m=new ArrayList<>();
		for(int i=0;i<N;i++){
		    int no=sum-ar[i];
		    m.add(ar[i]);
		    while(j < N){
		        if(ar[j]==no && !m.contains(no)){
		            count++;
		        }
		        j++;
		    }
		    j=0;
		}
		System.out.println(count);
	    
	   }
}

package javaCore;

import java.util.Scanner;

public class JazzyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] Ni=new int[N];
		for(int i=0;i<N;i++){
		    Ni[i]=sc.nextInt();
		}
		 int max=0;
		   for(int i=0 ;i< N;i++){
		      if(Ni[i]>1){
		          int temp=1;
		          while(temp<=Ni[i]){
		              if(Ni[i]%temp==0){
		            	  int a=Ni[i]/temp;
		            	  
		              }
		               
		            temp++;
		          }
		      }else{
		          max+=Ni[i];
		      }

		   }
		   System.out.println(max);
	}

}

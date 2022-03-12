package javaCore;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindAppear {

	public static void main(String args[] ) throws Exception {

    	//Write code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];

        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(ar[i]))
                map.put(ar[i],map.get(ar[i])+1);
            else
                map.put(ar[i],1);
        }
        int no=0;
for(Map.Entry<Integer, Integer> e:map.entrySet()) {
	if(e.getValue()==1) {
		no=e.getKey();
	}
}
System.out.println(no);
   }
}

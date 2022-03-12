package javaCore;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HighestOccurance {
public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
		int n=sc.nextInt();
		int[] k=new int[n];
		for(int i=0;i<k.length;i++) {
			k[i]=sc.nextInt();
		}
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<k.length;i++) {
		 if(map.containsKey(k[i]))
			 map.put(k[i], map.get(k[i])+1);
		 else
			 map.put(k[i], 1);
		}
		map.entrySet().forEach(e->System.out.println(e.getKey()+"\t"+e.getValue()));
	}
}
}

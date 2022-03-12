package javaCore;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PokeMon {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		String[] s=new String[no+1];
		for(int i=0;i<=no;i++) {
			s[i]=sc.nextLine();
		}
		Set<String> set=new TreeSet<>();
		for(int i=1;i<=no;i++) {
			set.add(s[i]);
		}
		int l=1,r=1,ans=Integer.MAX_VALUE, max=s.length;
		Map<String,Integer> map=new HashMap<>();
		while(l<=r) {
			if(map.size()==set.size())
				ans=Math.min(r-l, ans);
			
			if(map.size()<set.size()) {
				if(r==max)
					break;
				else {
					if(map.containsKey(s[r]))
						map.put(s[r], map.get(s[r])+1);
					else
						map.put(s[r], 1);
					
					r++;
				}
			}else if(map.size()==set.size()) {
				if(map.get(s[l])==1)
					map.remove(s[l]);
				else
					map.put(s[l], map.get(s[l])-1);
				
				l++;
			}
		}
		System.out.println(ans);
	}
}

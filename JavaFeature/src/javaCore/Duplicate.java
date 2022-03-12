package javaCore;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

    	//Write code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] a=new String[n+1];
        for(int i=0;i<=n;i++){
            a[i]=sc.nextLine();
        }
        Set<String> se=new HashSet<>();
        for(int i=1;i<=n;i++)
            se.add(a[i]);

        Map<String,Integer> map=new HashMap<>();
        int s=1,e=1,ans=Integer.MAX_VALUE;
        while(e<=n && s<=n){
            if(map.size()==se.size())
                ans=Math.min(e-s,ans);
            if(map.size() <se.size()){
                if(e==a.length)
                    break;
                else{
                    if(map.containsKey(a[e]) )
                        map.put(a[e],map.get(a[e])+1);
                    else
                      map.put(a[e],1);

                    e++;
                }
            }else if(map.size()==se.size()){
                if(map.get(a[s])==1)
                    map.remove(a[s]);
                else
                    map.put(a[s],map.get(a[s])-1);

                s++;
            }
        }
        System.out.println(ans);

	}

}

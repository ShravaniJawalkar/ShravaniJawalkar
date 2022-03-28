package com.example.springhiberjavaConfig.entity.java;

import java.util.ArrayList;
import java.util.Scanner;

public class SetZero {
    	public static void setZeroes(ArrayList<ArrayList<Integer>> a) {
    		
    		int rowLen=a.size()-1;
    		int colLen=a.get(0).size()-1;

      boolean firstRow=false, firstCol=false;
      for(int i=0;i<=colLen;i++) {
    	  if(a.get(0).get(i)==0)
    		  firstRow=true;
      }
      for(int i=0;i<=rowLen;i++) {
    	  if(a.get(i).get(0)==0)
    		  firstCol=true;
      }
        for(int i=rowLen;i>0;i--){
            for(int j=colLen;j>0;j--){
                if(a.get(i).get(j)==0){
                	a.get(0).set(j, 0);
                	a.get(i).set(0, 0);
                    
                }
            }
        }
        for(int i=rowLen;i>0;i--){
            for(int j=colLen;j>0;j--){
                if(a.get(i).get(0)==0||a.get(0).get(j)==0){
                	a.get(i).set(j, 0);
                    //a.set(i, null)
                }
            }
        }
        if(firstRow) {
        	int j=0,lim=a.get(0).size();
        	while(j<lim) {
        		a.get(0).set(j, 0);
        		j++;
        	}
        }
        if(firstCol) {
        	int j=0,lim=a.size();
        	while(j<lim) {
        		a.get(j).set(0, 0);
        		j++;
        	}
        }
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		ArrayList<ArrayList<Integer>> l=new ArrayList<>();
		for(int i=0;i<x;i++){
		    l.add(new ArrayList<Integer>());}
		 for(int i=0;i<x;i++){
		    for(int j=0;j<y;j++){
		        int k=sc.nextInt();
		        l.get(i).add(k);
		    }
		}
		setZeroes(l);
		System.out.println(l);
	}
}
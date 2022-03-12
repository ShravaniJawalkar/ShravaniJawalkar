package javaCore;

import java.util.Scanner;
import java.util.Vector;

public class StellaColouringTreeBranch {
	static Vector<Vector<Integer>> tree=new Vector<>();
public static void main(String args[]) {
	try (Scanner sc = new Scanner(System.in)) {
		while(sc.hasNext()) {
			if((sc.nextLine()).equals("Q")) {
				break;
			}
			int x=sc.nextInt();
			int y=sc.nextInt();
			addNode(x,y);
			
		}
		int count =findMinimumColor(0,1);
		System.out.println(count);
	}catch(Exception e) {System.out.println(e);}
}

private static int findMinimumColor(int child,int parent) {
	// TODO Auto-generated method stub
	for(int i=0;i<tree.get(parent).size();i++) {
	//if(if(tree.get(child).get(i)))	
	}
	
	return 0;
}

private static void addNode(int x, int y) {
	// TODO Auto-generated method stub
	tree.get(x).add(y);
	tree.get(y).add(x);
	
}
}

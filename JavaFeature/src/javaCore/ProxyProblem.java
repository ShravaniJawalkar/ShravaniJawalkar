package javaCore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ProxyProblem {
	public static void main(String args[]) {
		try  {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int noOfStud=Integer.parseInt(br.readLine());
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
			String[] listOfElement=new String[noOfStud+1];
			for(int i=1;i<=noOfStud;i++) {
				listOfElement[i]=br1.readLine();
			}
			List<Integer> present=new ArrayList<>();
			List<String> absent=new ArrayList<>();
			for(int i=1;i<listOfElement.length;i++) {
				int k=Integer.parseInt(listOfElement[i]);
				if(!present.contains(k))
					present.add(k);
			}
			for(int i=1;i<listOfElement.length;i++) {
				if(!present.contains(i))
					absent.add(String.valueOf(i));
			}
			absent.forEach(System.out::println);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

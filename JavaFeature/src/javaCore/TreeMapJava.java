package javaCore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TreeMapJava {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			int nodes = sc.nextInt();
			List<List<Integer>> list = new ArrayList<>();
			for (int i = 1; i <= nodes + 1; i++) {
				list.add(new ArrayList<Integer>());
			}

			for (int i = 1; i <= nodes + 1; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				addNodes(list, x, y);
			}
			int pairs = sc.nextInt();
			List<List<Integer>> nodePair = new ArrayList<>();
			for (int i = 0; i <= pairs + 1; i++) {
				nodePair.add(new ArrayList<Integer>());
			}
			for (int i = 0; i <= pairs + 1; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				addNodes(nodePair, x, y);
			}
			List<List<Integer>> result=getBestLeadPair(nodePair,list);

		}

	}

	private static List<List<Integer>> getBestLeadPair(List<List<Integer>> nodePair, List<List<Integer>> list) {
	
		return null;
	}

	public static void addNodes(List<List<Integer>> nodePair, int parent, int child) {
		nodePair.get(parent).add(child);
		nodePair.get(child).add(parent);
	}
}

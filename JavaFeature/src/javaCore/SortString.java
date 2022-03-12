package javaCore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortString {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n+1];
		for (int i = 0; i <= n; i++) {
			String k = sc.nextLine();
			if (k != null && !k.isEmpty())
				s[i] = k;
		}
		List<String> l = new ArrayList<>();
		for(int i=1;i<=n;i++) {
			l.add(s[i]);
		}

	}
}

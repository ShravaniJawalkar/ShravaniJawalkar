package javaCore;

import java.util.Scanner;

public class PatternMatch {
	public static final int no_of_char = 256;

	static String findSubString(String str, String pat) {
		int len1 = str.length();
		int len2 = pat.length();
		if (len1 < len2) {
			System.out.println("no matching possible");
			return "";
		}
		int[] ht_str = new int[no_of_char];
		int[] ht_pat = new int[no_of_char];

		for (int i = 0; i < len2; i++) {
			ht_pat[pat.charAt(i)]++;
		}
		int start = 0, start_index = -1, minlen = Integer.MAX_VALUE, count = 0;
		for (int j = 0; j < len1; j++) {
			ht_str[str.charAt(j)]++;

			if (ht_str[str.charAt(j)] <= ht_pat[str.charAt(j)])
				count++;

			if (count == len2) {
				while (ht_str[str.charAt(start)] > ht_pat[str.charAt(start)] || ht_pat[str.charAt(start)] == 0) {
					if (ht_str[str.charAt(start)] > ht_pat[str.charAt(start)])
						ht_str[str.charAt(start)]--;

					start++;
				}
				int lenWindow = j - start + 1;
				if (minlen > lenWindow) {
					minlen = lenWindow;
					start_index = start;
				}
			}
			
		}
		if (start_index == -1) {
			System.out.println("no matching possible");
			return "";
		}
		return str.substring(start_index, minlen + start_index);
	}

	// Driver Method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String pat = sc.nextLine();

		System.out.print("Smallest window is :\n " + findSubString(str, pat));
	}
}

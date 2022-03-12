package javaCore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MatrixMu {
	private static void printMatrix(int mat[][], int m, int n, int i, int j, List<Integer> list) {
//return if i or j crosses matrix size
		if (i > m || j > n)
			return;
		list.add(mat[i][j]);
		if (i == m && j == n) {
			for(int k=0; k<list.size();k++) {
					if(k==list.size()-1)
						System.out.print(list.get(k));
					else
						System.out.print(list.get(k)+" ");
					
			}
			System.out.println("");
		}
		printMatrix(mat, m, n, i + 1, j, list);
		printMatrix(mat, m, n, i, j + 1, list);
		list.remove(list.size() - 1);

	}

// Driver code
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] a=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
		List<Integer> list = new ArrayList<>();
		printMatrix(a, m - 1, n - 1, 0, 0, list);
	}
}

package application;

import java.util.Scanner;

public class ProgCap5Matriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int[][] mat = new int[n][n];

		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
	}

}

package application;

import java.util.Scanner;

public class ProgCap5ExeMatriz {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe os valores de m e n:");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mat = new int[m][n];	
		
		System.out.println();
		for (int i=0; i<m; i++) {
			System.out.println("Informe os valores da linha "+ (i+1));
			for (int j=0; j<n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("Imprimindo Matriz:");
		for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.print("What number to find? ");
		int number = sc.nextInt();
		
		for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				if (mat[i][j] == number) {
					System.out.println("Position "+ i+","+j+":");
					if (j-1 >= 0)
					System.out.println("Left: "+mat[i][j-1]);
					if (j+1 < m)
					System.out.println("Right: "+mat[i][j+1]);
					if (i-1 >= 0)
					System.out.println("Up: "+mat[i-1][j]);
					if (i+1 < n)
					System.out.println("Down: "+mat[i+1][j]);
					
				}
			}
		}

		sc.close();
	}
}

package course;

import java.util.Scanner;

public class ExercicioCap02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de N:");
		int n = sc.nextInt();
		
		while (n <= 0) {
			System.out.print("N deve ser positivo, digite outro:");
			n = sc.nextInt();
		}	
		
		int maior = Integer.MIN_VALUE;
		for (int i=1;i<=n;i++) {
			System.out.print("Valor "+ i +":");
			int x = sc.nextInt();
			if (x > maior) {
				maior = x;
			}
		}
		sc.close();
		System.out.println("Maior: " + maior);
		
	}
}
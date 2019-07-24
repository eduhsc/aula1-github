package course;

import java.util.Scanner;

public class Funcoes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 3 valores para calcular o maior:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maior = max(a,b,c);
		Basico.exibir("O maior é: " + maior);
		
		sc.close();
	}

	public static int max(int x, int y, int z) {
		int maior;
		if ((x > y) && (x > z)){
			maior = x;
		}else if ( y > z){
			maior = y;
			
		}else {
			maior = z;
		}
		return maior;
	}

}

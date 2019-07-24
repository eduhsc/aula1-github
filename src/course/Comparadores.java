package course;

import java.util.Scanner;

public class Comparadores {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int maior;
		
		//Encontrar o maior entre os 3
	/*	if ((a > b) && (a > c)){
			maior = a;
		}else if ( b > c){
			maior = b;
			
		}else {
			maior = c;
		} */
		
		//Outra opção para encontrar o maior entre os 3
		int aux = Math.max(a, b);
		maior = Math.max(aux, c);
		
		System.out.println("Maior: "+ maior);
		sc.close();
	}

}

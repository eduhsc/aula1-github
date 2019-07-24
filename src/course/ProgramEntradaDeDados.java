package course;

import java.util.Locale;
import java.util.Scanner;

public class ProgramEntradaDeDados {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your full name:");
		String fullName = sc.nextLine();
		
		System.out.println("How many bedrooms are there in your house?");
		int quartos = sc.nextInt();
		
		System.out.println("Enter product price:");
		double preco = sc.nextDouble();
		
		System.out.println("Enter your last name, age and height (same line):");
		String ultNome = sc.next();
		int idade = sc.nextInt();
		double altura = sc.nextDouble();
		
		System.out.println(fullName);
		System.out.println(quartos);
		System.out.println(preco);
		System.out.println(ultNome);
		System.out.println(idade);
		System.out.println(altura);
		
		sc.close();
		
		
		
	}

}

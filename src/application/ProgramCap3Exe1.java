package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Retangulo;

public class ProgramCap3Exe1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Retangulo ret = new Retangulo();
		System.out.print("Enter the rectangule width:");
		ret.largura = sc.nextDouble();
		
		System.out.print("Enter the rectangule heith:");
		ret.altura = sc.nextDouble();
		
		sc.close();
		
		System.out.println("Área do retângulo:" + String.format("%.2f", ret.calcularArea()) );
		System.out.println("Perímetro do retângulo:" + String.format("%.2f",ret.calcularPerimetro()) );
		System.out.println("Área do retângulo:" + String.format("%.2f",ret.calcularDiagonal()) );
		
		
	}

}

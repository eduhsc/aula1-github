package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.CurrencyConverter;

public class MetodoStatico {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("What is the dollar price? ");
		double price = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double qtde = sc.nextDouble();
		
		System.out.println("");
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.converter(price, qtde));
		
		sc.close();
	}

}

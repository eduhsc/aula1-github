package application;

import java.util.Scanner;

import entidades.Carro;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Carro x = new Carro();
		x.odometro = sc.nextDouble(); //Em horas
		x.tempo = sc.nextDouble();  //Em minutos
		
		double velMedia = x.odometro / (x.tempo/60.0);
		System.out.printf("Velocidade média foi: %.2f km/h", velMedia);
		
		sc.close();
	}

}

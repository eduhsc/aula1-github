package application;

import java.util.Scanner;

import entidades.Conta;

public class ProgramCap4Exe1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int conta;
		String titular;
		double valor;
		String depositoInicial;
		Conta c;
		
		System.out.print("Enter account number: ");
		conta = sc.nextInt();
		System.out.print("Enter account holder: ");
		titular = sc.next();
		System.out.print("Existe um depósito inicial (y/n)? ");
		depositoInicial = sc.next();
		
		if (depositoInicial.contentEquals("y")) {
			System.out.print("Enter initial deposit: ");
			valor = sc.nextDouble();
			c = new Conta(conta, titular, valor);
		}else {
			c = new Conta(conta, titular);
		}
		
		System.out.println("Account data:");
		System.out.println("Account "+ c.getConta() + ", Holder: "+ c.getTitular() + ", Balance: "+ c.getSaldo());
		
		System.out.print("Enter the deposit value: ");
		c.depositar(sc.nextDouble());
		System.out.println("Account data:");
		System.out.println("Account "+ c.getConta() + ", Holder: "+ c.getTitular() + ", Balance: "+ c.getSaldo());

		System.out.print("Enter the saque: ");
		c.sacar(sc.nextDouble());
		System.out.println("Account data:");
		System.out.println("Account "+ c.getConta() + ", Holder: "+ c.getTitular() + ", Balance: "+ c.getSaldo());

		
		sc.close();
	}

}

package entidades;

public class Conta {

	private int conta;
	private String titular;
	private double saldo;
	
	public Conta(int conta, String titular) {
		this.conta = conta;
		this.titular = titular;
	}
	
	public Conta(int conta, String titular, double saldo) {
		this.conta = conta;
		this.titular = titular;
		depositar(saldo);
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void sacar(double valor) {
		this.saldo -= (valor + 5.00);
	}
	
	public int getConta() {
		return conta;
	}

	public double getSaldo() {
		return saldo;
	}

	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	
}

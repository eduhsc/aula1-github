package course;

public class OperadorTernario {

	public static void main(String[] args) {

		double preco, desconto;
		preco = 20;
		
		desconto = (preco <= 50) ? preco * 0.1 : preco * 0.2;
		
		System.out.println("Preço:" + preco);
		System.out.println("Desconto: " + desconto);
	}

}

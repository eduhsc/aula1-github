package entidades;

public class Retangulo {

	public double altura;
	public double largura;
	
	public double calcularArea() {
		return altura * largura;
	}
	
	public double calcularPerimetro() {
		return 2 * (altura + largura);
	}
	
	public double calcularDiagonal() {
		return (altura*altura) + (largura*largura);
	}
}

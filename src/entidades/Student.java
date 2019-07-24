package entidades;

public class Student {

	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	public final double media = 60.00; 
	
	public double obterNotaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public boolean pass() {
		if (obterNotaFinal() >= media) {
		return true;
		}else {
			return false;
		}
	}
}

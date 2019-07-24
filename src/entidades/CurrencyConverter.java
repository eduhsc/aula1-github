package entidades;

public class CurrencyConverter {

	public static final double IOF = 6.00;
	
	public static double converter(double priceDolar, double qtdeDolar) {
		double subTotal = priceDolar * qtdeDolar;
		subTotal += (subTotal * IOF)/100;
		return subTotal;
	}
}

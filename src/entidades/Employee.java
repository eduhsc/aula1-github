package entidades;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double perc) {
		this.grossSalary += ((this.grossSalary * perc)/100);
		
	}
}

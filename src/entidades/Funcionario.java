package entidades;

public class Funcionario {

	int id;
	String name;
	double salary;
	
	public Funcionario (int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void incSalary(double perc) {
		this.salary += ((this.salary * perc)/100);
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return this.getId()+
				", " +
				this.getName()+
				", " +
				this.getSalary();
	}
}

package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Employee;

public class ProgramCap3Exe2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Employee emp = new Employee();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Name:");
		emp.name = sc.next();
		System.out.print("Gross salary:");
		emp.grossSalary = sc.nextDouble();
		System.out.print("Tax:");
		emp.tax = sc.nextDouble();
		System.out.println("");
		System.out.println("Employee: "+ emp.name +", $ " + String.format("%.2f",emp.netSalary()));
		
		System.out.println("");
		System.out.print("Which percentage to increase salary?");
		double x = sc.nextDouble();
		emp.increaseSalary(x);
		
		System.out.println("Employee: "+ emp.name +", $ " + String.format("%.2f",emp.netSalary()));
	}

}

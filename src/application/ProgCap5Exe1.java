package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;

public class ProgCap5Exe1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Funcionario> list = new ArrayList<>();
		
		System.out.print("How many funcionários will be registered? ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			Funcionario func;
			System.out.println("Funcionário #"+ (i+1));
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			func = new Funcionario(id, name, salary);
			list.add(func);
		}
		
		System.out.println("----------------------------------");
		System.out.print("Enter the funcinario id that will have salary increase: ");
		int idInc = sc.nextInt();
		
		int index = 1000;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == idInc){
				index = i;
			}
		}
		
		if (index != 1000) {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			list.get(index).incSalary(percentage);
		}else {
			System.out.println("This id does not exist!");
		}
		
		System.out.println("--------------------------------------");
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getId()+", "+list.get(i).getName()+", "+list.get(i).getSalary());
		}
		
		
		sc.close();
	}

}

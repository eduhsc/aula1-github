package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Student;

public class ProgramCap3Exe3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Student stu = new Student();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Student name:");
		stu.name = sc.nextLine();
		System.out.print("Nota 1:");
		stu.nota1 = sc.nextDouble();
		System.out.print("Nota 2:");
		stu.nota2 = sc.nextDouble();
		System.out.print("Nota 3:");
		stu.nota3 = sc.nextDouble();
		
		System.out.println("FINAL GRADE = " + String.format("%.2f",stu.obterNotaFinal()) );
		if (stu.pass()) {
			System.out.println("PASS");
		}else {
			System.out.println("FAILED");
			System.out.println("MISSING " + (stu.media-stu.obterNotaFinal()) + " POINTS" );
		}
		
		sc.close();
	}

}

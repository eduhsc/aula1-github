package course;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String day;
		sc.close();
		
		switch (x) {
		case 1:
			day = "Domingo";
			break;
		
		case 2:
			day = "Segunda";
			break;
			
		case 3: 
			day = "Terça";
			break;
			
		default:
			day = "Invalid data";
				
		}
		
		System.out.println(day);
	}


}

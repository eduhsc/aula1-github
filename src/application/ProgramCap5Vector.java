package application;

import java.util.Scanner;

import entidades.Quarto;

public class ProgramCap5Vector {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		Quarto[] rooms = new Quarto[10];
		
		for (int i=0; i<n; i++) {
			System.out.println("Rent #"+(i+1)+":");
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			rooms[room] = new Quarto(name, email);
		}
		 System.out.println();
		 System.out.println("Busy rooms:");
		for (int i=0;i<rooms.length;i++) {
			if (rooms[i] != null) {
				System.out.println(i+": "+ rooms[i].getName() + ", " + rooms[i].getEmail());
			}
			
		}
		
		sc.close();
	}

}

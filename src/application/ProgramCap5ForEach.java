package application;

public class ProgramCap5ForEach {

	public static void main(String[] args) {

		String[] vect = new String[] {"João","Maria","Renata"};
		int[] vect2 = new int[] {2,5,6,8,1};
		
		for (String obj: vect) {
			System.out.println(obj);
		}
		
		for (int obj: vect2) {
			System.out.println(obj);
		}
	
	}
}

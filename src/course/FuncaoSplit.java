package course;

public class FuncaoSplit {

	public static void main(String[] args) {
		
		String original = "Eduardo Haddad Souza Chaves";
		
		String[] vet = original.split(" ", 2);
		
		System.out.println("Posições do vetor: "+ vet.length);
		System.out.println(vet[0]);
		System.out.println(vet[1]);
		//System.out.println(vet[2]);
		//System.out.println(vet[3]);
	}

}

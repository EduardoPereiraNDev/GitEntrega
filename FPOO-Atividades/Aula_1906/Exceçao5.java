package Aula_1906;

public class Exceçao5 {

	public static void main(String[] args) {
		String frase = null;
		String nova_frase =null;
		try {
			nova_frase = frase.toUpperCase();
		} catch (Exception e) {
			System.out.println("Frase INICIAL");
			frase = "frase vazia";
		}
		finally {
			nova_frase = frase.toUpperCase();
		}
		System.out.println("Frase antiga"+ frase);
		System.out.println("Frase antiga"+ nova_frase);
	}

}

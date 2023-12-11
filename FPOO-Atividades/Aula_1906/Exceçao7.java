package Aula_1906;

import java.util.Scanner;

public class Exceçao7 {

	public static void main(String[] args) {
		String cpf;
		Scanner entrada = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("Digite o cpf");
				cpf= entrada.nextLine();
				if (!validarCPF(cpf)) {
					throw new IllegalArgumentException("Cpf invalido!"+ "Digite novamente");
				}
				break;
				}
			 	catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Cpf Valido!!");
			entrada.close();
		}
	}
		public static boolean validarCPF(String cpf) {//boolean - certo ou errado
			//eliminar caracteres especiais
			cpf= cpf.replaceAll ("\\D", "");
			if (cpf.length() !=11) {
				return false;
			}
			if (cpf.matches("\\d\\\1{10}")) {
				return false;
			}
			return true;
		}
}


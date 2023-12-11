package Aula_1906;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceçao6 {

	public static void main(String[] args) {
		try {
			File arquivo = new File ("C://Users//Instrutor//Desktop/texto.txt");
			Scanner entrada = new Scanner (arquivo, "UTF-8");
			while (entrada.hasNextLine()) {
				String linha = entrada.nextLine ();
				System.out.println("Texto do arquivo----"+linha);
			}
			entrada.close();
		} catch (FileNotFoundException e) {
			System.out.println("Nao foi encontrado");
		} catch (Exception e) {
			System.out.println("Ocorreu um erro ao ler");
		}
		System.out.println("O programa foi encerrado");
	}

}

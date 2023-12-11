package Aula_1906;

import java.util.Scanner;

public class Exceçao2 {

	public static void main(String[] args) {
		int n1, n2 ;
		Scanner entrada = new Scanner (System.in);
		
		try {
			System.out.println("digite numero 1:");
			n1 = entrada.nextInt();
			System.out.println("digite numero 2:");
			n2 = entrada.nextInt();
			System.out.println("A soma é:"+ (n1 + n2)) ;
		} catch (Exception e) {
			System.out.println("ERRO: Digite um numero INTEIRO!");
		}

	}

}

package Atividade_Eduardo_Pereira;

import java.util.Scanner;

public class Leilao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Escreva numero de lances:");
		int numero = entrada.nextInt();
		int v=0;
		int [] n={v};
		String c = null;
		String [] n1= {c};
		for (int i = 0; i < numero ; i++) {
			System.out.println("Escreva o nome:");
			String c1 = entrada.next();
			System.out.println("Escreva o valor:");
			int lance = entrada.nextInt();
			if (lance > n[0]) {
				n[0] = lance ;
				n1[0]= c1 ;
			} 
		}
		System.out.printf("O nome do licitante e:%s\n", n1[0] );
		System.out.printf("O valor dado e:%d", n[0] );
	} 
}


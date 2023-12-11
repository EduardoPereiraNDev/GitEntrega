package Atividade_Eduardo_Pereira;

import java.util.Iterator;
import java.util.Scanner;

public class Poste {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int s = 0,c = 0,n=0;
		System.out.println("Escreva a quantidade de postes na cerca:");
		int cerca = entrada.nextInt();
		int[] postes = new int [cerca];
		for (int i = 0; i < cerca; i++) {
			System.out.println("Escreva a altura dos postes:");
			int altura = entrada.nextInt();
			if (altura > 85 ) {
				n++;
			}else if (altura >50) {
				c++;
			}else {
				s++;
			}
		}
		System.out.println("A quantidade de postes para se substituir e de:"+ s + "\nJa a quantidade de postes"
				+ " para se consertar e de:"+c+ "\nE a quantidade de postes que nao precisa mexer e de:"+n);
	}
}

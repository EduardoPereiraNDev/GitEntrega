package Atividade_Eduardo_Pereira;

import java.util.Scanner;

public class Cobra {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Escreva os numeros:");
		int a = entrada.nextInt();
		int b = entrada.nextInt();
		int c = entrada.nextInt();
		int d = entrada.nextInt(); 
		if ( a==c || b==d) {
			System.out.println("Verdadeiro");
		}else {
			System.out.println("Falso");
		}

	}

}

package Atividade_Eduardo_Pereira;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int n1;
		int guarda=1000;
			while (true) {
				System.out.println("digite o numero, caso queira parar digite 0 :");
				Scanner entrada = new Scanner (System.in);
			    n1 = entrada.nextInt();
			    if (n1 == 0) {
					   break;
					}
				if ( n1< guarda) {
					guarda = n1 ;
				}
			}
				System.out.println("O menor numero e:"+ guarda);
			}
}
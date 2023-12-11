package Aula_1406;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExArray {

	public static void main(String[] args) {
		int [] notas = new int [2];
		int i;
		Scanner entrada = new Scanner(System.in);
		
		for ( i = 0; i < 2; i++) {
			System.out.println("\nEntre com o numero:" + (i+1) + ":");
			notas[i] = entrada.nextInt() ;
		}
		for ( i = 0; i < 2; i++) {
			System.out.printf("Numero %d --> nota armazenada: %d",(i+1), notas[i]);
		}
		for (i = 0; i < 2 ; i++) {
			int soma = 0;
			soma= notas [i] + soma;
			 
		}
		}
	}
		
//d= decimal
//s= texto
//for = ver vetor 
//nextInt = ver o proximo numero digitado
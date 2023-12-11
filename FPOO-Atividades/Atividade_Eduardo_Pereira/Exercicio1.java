package Atividade_Eduardo_Pereira;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int soma =0;
			while (true) {
				System.out.println("digite o numero :");
				Scanner entrada = new Scanner (System.in);
				int n1 = entrada.nextInt();
				if (n1<0) {
					break;
				}
				soma += n1;
			}
				System.out.println("A soma é:"+(soma));
			}
			
		}



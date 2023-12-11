package Atividade_Eduardo_Pereira;

import java.util.Scanner;

public class Contas3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Escreva o valor disponivel:");
		int v = entrada.nextInt();
		System.out.println("Escreva o valor do acougue:");
		int a = entrada.nextInt();
		System.out.println("Escreva o valor da farmacia:");
		int f = entrada.nextInt();
		System.out.println("Escreva o valor da padaria:");
		int p = entrada.nextInt();
		
		int resp = 0;
		int []contas= {a,f,p};
		
		if (contas [0] + contas [1] + contas[2] <= v) 
			resp = 3 ;
		else if (contas [0] + contas [1] <= v) 
			resp = 2;
		else if (contas [0] <= v)
			resp=1 ;
		else 
		resp=0;
		System.out.printf("%d\n", resp);
	}
}

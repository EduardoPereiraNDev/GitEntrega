package Atividade_Eduardo_Pereira;

import java.util.Scanner;

public class Album {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Escreva os numeros de espacos:");
		int espacos = entrada.nextInt();
		System.out.println("Escreva a quantidade de figurinhas:");
		int figurinhas = entrada.nextInt();
		Boolean []rep = new Boolean[espacos];
		int x;
		for (int i = 0; i < espacos ; i++) 
			rep[i] = false;
		
		for (int i = 0; i < figurinhas; i++) {
			x= entrada.nextInt();
			rep[x]=true;
		}
		int repetidas=0;
		for (int i = 0; i < espacos; i++) 
			if (rep[i])
				repetidas= repetidas + 1;
		
		System.out.println("Repetidas = "+ ( espacos - repetidas ));
		System.out.println("tamanho album="+ espacos);
		System.out.println("Quantidade de figurinhas"+ figurinhas);
	}
}

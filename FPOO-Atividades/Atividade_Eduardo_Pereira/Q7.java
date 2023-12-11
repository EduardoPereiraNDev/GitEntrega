package Atividade_Eduardo_Pereira;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite a quantidade de moedas:");
		int moedas = entrada.nextInt();
		System.out.println("Digite a quantidade de marinheiros:");
		int marinheiros = entrada.nextInt();
	    marinheiros = marinheiros + 2;
	    int divisao = moedas / marinheiros;
	    int capitao = divisao * 2;
	    System.out.println("A quantidade de moedas do capitao e:"+ capitao);
	    System.out.println("Ja a quantidade de moedas de cada marinheiro é de:"+ divisao);
	}
}

package Atividade_Eduardo_Pereira;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		System.out.println("Escreva as idades para a compra do ingresso:");
		Scanner entrada = new Scanner (System.in);
		int idade = entrada.nextInt();
		int idade2 = entrada.nextInt();
		int preco = 0;
		if (idade >=1 && idade<= 17 ) {
			preco = preco + 15;
		}else if (idade >= 18 && idade <= 59) {
			preco = preco + 30;
		}else if (idade >= 60 && idade <=100) {
			preco = preco + 20;
		}else {
			System.out.println("Não é possivel identificar esta idade");
		}
		if (idade2 >=1 && idade2 <= 17 ) {
			preco = preco + 15;
		}else if (idade2 >= 18 && idade2 <= 59) {
			preco = preco + 30;
		}else if (idade2 >= 60 && idade2 <=100) {
			preco = preco + 20;
		}else {
			System.out.println("Não é possivel identificar esta idade");
		}
		System.out.println("O preco total e:"+ preco);
	}

}

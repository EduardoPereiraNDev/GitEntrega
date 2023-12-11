package Atv5;

import java.util.Iterator;
import java.util.Scanner;

public class TestePadaria {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		Pao pao1 = new Pao("Sirio",1.99);
		Pao pao2 = new Pao("Frances",0.99);
		Bolo bolo1 = new Bolo("Cereja",29.99);
		Bolo bolo2 = new Bolo("Chocolate", 35.99);
		Doce doce1= new Doce("Brigadeiro", 3.99);
		Doce doce2 = new Doce("Bombom",1.99);
		
		PessoaPadaria pessoa = new PessoaPadaria();
		System.out.println("Qual seu nome:");
		String n = entrada.next();
		pessoa.setNome(n);
		System.out.println("Qual sua idade:");
		int i = entrada.nextInt();
		pessoa.setIdade(i);
	//	pao1.assar();
	//	pao2.assar();
	//	bolo1.assar();
	//	bolo2.assar();
	//	doce1.misturar();
	//	doce2.misturar();
		
		System.out.println("Quantos produtos voce gostaria de comprar:");
		int qua = entrada.nextInt();
		
		double precoT = 0;
		for (int j = 0; j < qua; j++) {
		System.out.println("\n Escolha suas compras:");
		System.out.println("-----------\n Pao");
		System.out.println("-----------\n Bolo");
		System.out.println("-----------\n Doce");
		System.out.println("---------- \n Sair");
		String ii;
		
			
		
		do {
			String opcao = entrada.next();
			ii = opcao;
			switch (opcao) {
			case "Pao":
				//
					pao1.exibir();
					pao2.exibir();
				   opcao = entrada.next();
					switch (opcao) {
					case "Sirio":
						System.out.println("Voce comprou um pao Sirio");
						precoT = precoT + 1.99;
						break;
					case "Frances" :
						System.out.println("Voce comprou um pao Frances");
						precoT = precoT + 0.99;
						break;
					default:
						System.out.println("Escolha o pao");
						break;
					}
				//
				
				break;
			case "Bolo" :
				//
					bolo1.exibir();
					bolo2.exibir();
					opcao = entrada.next();
					switch (opcao) {
					case "Cereja":
						System.out.println("Voce comprou um bolo de Cereja");
						precoT = precoT + 29.99;
						break;
					case "Chocolate" :
						System.out.println("Voce comprou um bolo de Chocolate");
						precoT = precoT + 35.99;
						break;
					default:
						System.out.println("Escolha o bolo");
						break;
					}
				//
				break;
			case "Doce" :
				doce1.exibir();
				doce2.exibir();
				opcao = entrada.next();
				switch (opcao) {
				case "Brigadeiro": 
					System.out.println("Voce comprou um brigadeiro");
					precoT = precoT + 3.99;
					break;
				case "Bombom" :
					System.out.println("Voce comprou um bombom");
					precoT = precoT + 1.99;
					break;
				default:
					System.out.println("Escolha o doce");
					break;
				}
				break;
			default:
				System.out.println("Escolha o produto");
				break;
			}
			System.out.println();
			
		}while (ii == "Sair" );
		}
		System.out.println("Sua conta deu:"+ precoT);
		System.out.println("Voce comeu os seus doces");
	}

}

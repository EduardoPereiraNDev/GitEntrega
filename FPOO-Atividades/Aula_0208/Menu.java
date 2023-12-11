package Aula_0208;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int opcao;
		do {
			exibirMenu (); //metodo (acao)
			opcao = entrada.nextInt();
			switch (opcao) {
			case 0:
				System.out.println("Seu pedido foi concluido");
				break;
			case 1:
				System.out.println("Opcao 1 selecionada");
				break;
			case 2:
				System.out.println("Opcao 2 selecionada");
				break;
			case 3:
				System.out.println("Opcao 3 selecionada");
				break;
			default:
				System.out.println("Escolha as Opcoes de 1 a 3");
				break;
			}
			System.out.println();
			
		}while(opcao != 0);
	}
	public static void exibirMenu() {
		System.out.println("Selecione uma opcao");
		System.out.println("1-- Opcao 1");
		System.out.println("2-- Opcao 2");
		System.out.println("3-- Opcao 3");
		System.out.println("0-- SAIR");
	}
}

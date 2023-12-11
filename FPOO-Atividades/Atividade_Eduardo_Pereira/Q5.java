package Atividade_Eduardo_Pereira;

import java.util.Scanner;

public class Q5 {
	public static void exibirMenu() {
		System.out.println("Selecione uma opcao");
		System.out.println("1-- Adição");
		System.out.println("2-- Subtração");
		System.out.println("3-- Divisão");
		System.out.println("4-- Multiplicação");
		System.out.println("0-- SAIR");
	}
public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int opcao;
		do {
			exibirMenu (); //metodo (acao)
			opcao = entrada.nextInt();
			switch (opcao) {
			case 0:
				System.out.println("Voce saiu");
				break;
			case 1:
				System.out.println("Adição selecionada");
				System.out.println("Escolha os valores:");
				adicao();
				break;
			case 2:
				System.out.println("Subtração selecionada");
				System.out.println("Escolha os valores:");
				sub();
				break;
			case 3:
				System.out.println("Divisão selecionada");
				System.out.println("Escolha os valores:");
				div();
				break;
			case 4:
				System.out.println("Multiplicação selecionada");
				System.out.println("Escolha os valores:");
				mult();
				break;
			default:
				System.out.println("Escolha a formula");
				break;
			}
			System.out.println();
			
		}while(opcao != 0);
	}
	public static void adicao() {
		Scanner entrada = new Scanner (System.in);
		int valor1 = entrada.nextInt();
		int valor2 = entrada.nextInt();
		int resultado = valor1 + valor2 ;
		System.out.println("O resultado e:" + resultado);
	}
	public static void sub() {
		Scanner entrada = new Scanner (System.in);
		int valor1 = entrada.nextInt();
		int valor2 = entrada.nextInt();
		int resultado = valor1 - valor2 ;
		System.out.println("O resultado e:" + resultado);
	}
	public static void div() {
		Scanner entrada = new Scanner (System.in);
		int valor1 = entrada.nextInt();
		int valor2 = entrada.nextInt();
		int resultado = valor1 / valor2 ;
		System.out.println("O resultado e:" + resultado);
	}
	public static void mult() {
		Scanner entrada = new Scanner (System.in);
		int valor1 = entrada.nextInt();
		int valor2 = entrada.nextInt();
		int resultado = valor1 * valor2 ;
		System.out.println("O resultado e:" + resultado);
	}
	
}

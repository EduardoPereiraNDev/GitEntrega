package Aula_3008;

import java.util.Scanner;

public class TesteTv {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		ControleRemoto controle = new Tv();
		int volu=controle.getVolume();
		controle.ligar();
		controle.getPolegadas();
		int i;
		do {
			exibirMenu (); //metodo (acao)
			int opcao = entrada.nextInt();
			i = opcao;
			switch (opcao) {
			case 0:
				break;
			case 1:
				System.out.println("Voce aumentou o volume");
				controle.VolumeMais(volu);
				controle.getVolume();
				break;
			case 2:
				System.out.println("Voce diminuiu o volume");
				controle.VolumeMenos(volu);
				controle.getVolume();
				break;
			default:
				System.out.println("Escolha 1 ou 2");
				break;
			}
			System.out.println();
			
		}while (i != 0);
		controle.desligar();
	}
	public static void exibirMenu() {
		System.out.println("1-- Aumentar volume");
		System.out.println("2-- Dimnuir volume");
		System.out.println("0-- SAIR");
	}
}

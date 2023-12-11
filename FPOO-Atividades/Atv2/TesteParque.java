package Atv2;

import java.util.Scanner;

public class TesteParque {
	
	public static void exibirMenu() {
		System.out.println("Selecione uma opcao");
		System.out.println("1-- Cadastros");
		System.out.println("2-- Brinquedos");
		System.out.println("0-- SAIR");
	}
	public static void exibirMenu2() {
		System.out.println("Selecione uma opcao");
		System.out.println("1-- visitante1");
		System.out.println("2-- visitante2");
		System.out.println("0-- SAIR");
	}
	public static void exibirMenu3() {
		System.out.println("Selecione uma opcao");
		System.out.println("1-- Ver");
		System.out.println("2-- Modificar");
		System.out.println("0-- SAIR");
	}
	public static void exibirMenu4() {
		System.out.println("Selecione uma opcao");
		System.out.println("1-- Brinquedo 1");
		System.out.println("2-- Brinquedo 2");
		System.out.println("0-- SAIR");
	}
	public static void main(String[] args) {
		Visitante vis = new Visitante("Eduardo", 16,1.76f);
		Visitante vis2 = new Visitante("Heloa", 16,1.72f);
		
		Brinquedo br = new Brinquedo("Pula-pula",1.50f,20);
		Brinquedo br2 = new Brinquedo("Roda-Gigante",1.150f,25);
		
		Scanner entrada = new Scanner (System.in);
		int opcao;
			exibirMenu(); 
			opcao = entrada.nextInt();
			switch (opcao) {
			case 0:
				System.out.println("Voce saiu");
				break;
			case 1:
				int opcao2;
				exibirMenu2();
				opcao2 = entrada.nextInt();
				switch (opcao2) {
				case 0:
					System.out.println("Voce saiu");
					break;
				case 1:
					int opcao3;
					exibirMenu3();
					opcao3 = entrada.nextInt();
					switch (opcao3) {
					case 0:
						System.out.println("Voce saiu");
						return;
					case 1:
						vis.getnome();
						vis.getidade();
						vis.getaltura();
						vis.podeandar();
						return;
					case 2:
						vis.setnome(null);
						vis.setidade(0);
						vis.setaltura(0);
						vis.podeandar();
						return;
					default:
					System.out.println("Escolha alguma opcao");
						break;
					}
					break;
				case 2:
					int opcao4;
					exibirMenu3();
					opcao3 = entrada.nextInt();
					switch (opcao3) {
					case 0:
						System.out.println("Voce saiu");
						return;
					case 1:
						vis2.getnome();
						vis2.getidade();
						vis2.getaltura();
						vis2.podeandar();
						return;
					case 2:
						vis2.setnome(null);
						vis2.setidade(0);
						vis2.setaltura(0);
						vis2.podeandar();
						return;
				default:
				System.out.println("Escolha alguma opcao");
					break;
				}
			}
				break;
			case 2:
				int opcao5;
				exibirMenu4();
				opcao5 = entrada.nextInt();
				switch (opcao5) {
				case 0:
					System.out.println("Voce saiu");
					return;
				case 1:
					br.getNome();
					br.getalturaMinima();
					br.getcapacidadeMaxima();
					return;
				case 2:
					br2.getNome();
					br2.getalturaMinima();
					br2.getcapacidadeMaxima();
					return;
			default:
			System.out.println("Escolha alguma opcao");
				break;
			}
				break;
			default:
			System.out.println("Escolha alguma opcao");
				break;
			}
		} 
	}


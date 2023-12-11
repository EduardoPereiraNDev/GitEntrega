package Atv5;

import java.util.Scanner;

public class TesteVeiculo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		SpeedBike bikeSpe = new SpeedBike();
		MountainBike bikeMoun = new MountainBike();
			
			int ii;
			System.out.println("Quantos km possui o projeto?");
			int trajeto = entrada.nextInt();
			double i = 0;
			do {
				System.out.println("\n Escolha o que a pessoa 1 ira fazer:");
				System.out.println("1------Acelerar");
				System.out.println("2------Freiar");
				System.out.println("3------Mudar a marcha");
				int opcao = entrada.nextInt();
				switch (opcao) {
				case 1: 
					  bikeSpe.acelerar();
					  if (bikeSpe.velocidade >= 50) {
						i= i+2;
					}else if(bikeSpe.velocidade >= 100) {
						i= i+4;
					}else {
						i++;
					}
					  System.out.println("Voce esta no Km:"+ i);
					break;
				case 2 :
					 bikeSpe.frear();
					 if(bikeSpe.velocidade <= 0) {
						  i= i-0.5;
						  System.out.println("Voce esta no Km:"+ i);
					}else  if (bikeSpe.velocidade > 0) {
						  i++;
						  System.out.println("Voce esta no Km:"+ i);
					} else if (bikeSpe.velocidade >= 50) {
							i= i+2;
					}else if(bikeSpe.velocidade >= 100) {
							i= i+4;
					}
					break;
				case 3 :
					  bikeSpe.mudarMarcha();
					  i++;
					  System.out.println("Voce esta no Km:"+ i);
					break;
				default:
					System.out.println("Escolha o que fazer");
					break;
				}
				System.out.println();
				
			}while (i < trajeto );
			System.out.println("Você chegou ao final");
			
			System.out.println("Quantos km possui o projeto?");
			int trajeto2 = entrada.nextInt();
			double i2 = 0;
			do {
				System.out.println("\n Escolha o que a pessoa 2 ira fazer:");
				System.out.println("1------Acelerar");
				System.out.println("2------Freiar");
				System.out.println("3------Mudar a marcha");
				int opcao = entrada.nextInt();
				switch (opcao) {
				case 1: 
					  bikeSpe.acelerar();
					  if (bikeSpe.velocidade >= 50) {
						i2= i2+2;
					}else if(bikeSpe.velocidade >= 100) {
						i2= i2+4;
					}else {
						i2++;
					}
					  System.out.println("Voce esta no Km:"+ i2);
					break;
				case 2 :
					 bikeSpe.frear();
					 if(bikeSpe.velocidade <= 0) {
						  i2= i2-0.5;
						  System.out.println("Voce esta no Km:"+ i2);
					}else  if (bikeSpe.velocidade > 0) {
						  i2++;
						  System.out.println("Voce esta no Km:"+ i2);
					} else if (bikeSpe.velocidade >= 50) {
							i2= i2+2;
					}else if(bikeSpe.velocidade >= 100) {
							i2= i2+4;
					}
					break;
				case 3 :
					  bikeSpe.mudarMarcha();
					  i2++;
					  System.out.println("Voce esta no Km:"+ i2);
					break;
				default:
					System.out.println("Escolha o que fazer");
					break;
				}
				System.out.println();
				
			}while (i2 < trajeto2 );
			System.out.println("Você chegou ao final");
		}
}


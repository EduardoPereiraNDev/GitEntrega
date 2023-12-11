package Atv6;

import java.util.Scanner;

public class TesteCasa {
	public static void main(String []args) {
		Scanner entrada = new Scanner (System.in);
		String att;
		float atr;
		int atri;
		
		Sala sala1 = new Sala();
		System.out.println("---------------------------");
		System.out.println("Qual o nome de sua sala?");
		System.out.println("---------------------------");
		att= entrada.next();
		sala1.setNome(att);
		System.out.println("---------------------------");
		System.out.println("Sua sala possui Tv?");
		System.out.println("1----Sim");
		System.out.println("2----Nao");
		System.out.println("---------------------------");
		atri= entrada.nextInt();
		sala1.GetTemTV(atri);
		
		
		Quarto quarto1 = new Quarto();
		System.out.println("---------------------------");
		System.out.println("Qual o nome de seu quarto?");
		System.out.println("---------------------------");
		att= entrada.next();
		quarto1.setNome(att);
		System.out.println("---------------------------");
		System.out.println("Quantas camas possui o quarto?");
		System.out.println("---------------------------");
		atri= entrada.nextInt();
		quarto1.setNumeroCamas(atri);
		
		Casa casa1 = new Casa(null,0,0,sala1,quarto1);
		System.out.println("---------------------------");
		System.out.println("Qual a cor de sua casa?");
		System.out.println("---------------------------");
		att= entrada.next();
		casa1.setCor(att);
		System.out.println("---------------------------");
		System.out.println("Qual o preco de sua casa?");
		System.out.println("---------------------------");
		atr = entrada.nextFloat();
		casa1.setPreco(atr);
		System.out.println("---------------------------");
		System.out.println("Qual a metragem de sua casa?");
		System.out.println("---------------------------");
		atr = entrada.nextFloat();
		casa1.setMetragem(atr);
		
		casa1.mostrarDetalhes();
		System.out.println("O quarto possui "+ quarto1.getNumeroCamas()+" camas");
		}
}

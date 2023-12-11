package Atv8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TestePassagem {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		Voo v1 = new Voo();
		Cliente c1= new Cliente();
		Passagem p1 = new Passagem(v1,c1, 0);
		//
		System.out.println("Nome do passageiro");
		String n = entrada.next();
		c1.setNome(n);
		System.out.println("Sobrenome do passageiro");
	    n = entrada.next();
		c1.setNome(n);
		System.out.println("Digite o email:");
		n = entrada.next();
		c1.setNome(n);
		//
		System.out.println("--------PASSAGEM-------");
		System.out.println("Digite o numero do voo:");
		int e = entrada.nextInt();
		v1.setNumeroVoo(e);
		System.out.println("Digite a origem do voo:");
		String a = entrada.next();
		v1.setOrigem(a);
		System.out.println("Digite o destino do voo:");
		a = entrada.next();
		v1.setDestino(a);
		System.out.println("Digite o preco do voo:");
		double d = entrada.nextDouble();
		v1.setPreco(d);
		System.out.println("Digite a data de ida:");
		a = entrada.next();
		LocalDate Dataida= LocalDate.parse(a, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		v1.setDataIda(Dataida);
		System.out.println("Digite a data de volta:");
		a = entrada.next();
		LocalDate Datavolta= LocalDate.parse(a, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		v1.setDataVolta(Datavolta);
		System.out.println("--------PRECO TOTAL -------");
		System.out.println("Digite o preco total do voo:");
		double f = entrada.nextDouble();
		p1.setPrecoTotal(f);
		
		System.out.println("--------INFORMAÇÕES-------");
		System.out.println("Numero de voo:"+ v1.getNumeroVoo());
		System.out.println("Numero de voo:"+ v1.getOrigem());
		System.out.println("Numero de voo:"+ v1.getDestino());
		System.out.println("Numero de voo:"+ v1.getDataIda());
		System.out.println("Numero de voo:"+ v1.getDataVolta());
		System.out.println("Numero de voo:"+ v1.getPreco());
		System.out.println("--------------------------");
		System.out.println("Voce deseja compra-lo?");
		System.out.println("1--------------SIM");
		System.out.println("2--------------NAO");
		int z = entrada.nextInt();
		if (z==1) {
		System.out.println("Voce comprou");
		}else {
			System.out.println("Voce negou a compra");
		}
		
	}
}

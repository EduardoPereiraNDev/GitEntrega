package Atv7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Aula_0409.Livro;

public class TesteBanda {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		Banda banda = new Banda();
		Baixista b1 = new Baixista();
		Vocalista v1 = new Vocalista();
		Baterista ba1 = new Baterista();
		Guitarrista g1 = new Guitarrista();
		
		System.out.println("---------------------");
		System.out.println("         Banda       ");
		System.out.println("Qual o nome da banda?");
		String n = entrada.next();
		banda.setNome(n);
		System.out.println("---------------------");
		
		System.out.println("---------------------");
		System.out.println("     MembrosBanda    ");
		System.out.println("Digite o nome dos membros da banda");
		System.out.println("Baixista:");
		n = entrada.next();
		b1.setNome(n);
		System.out.println("Vocalista:");
		n = entrada.next();
		v1.setNome(n);
		System.out.println("Baterista");
		n = entrada.next();
		ba1.setNome(n);
		System.out.println("Vocalista");
		n = entrada.next();
		g1.setNome(n);
		System.out.println("---------------------");
		
		
		List <MembroBanda> membrosdaB = new ArrayList<MembroBanda>();
		membrosdaB.add(b1);
		membrosdaB.add(v1);
		membrosdaB.add(ba1);
		membrosdaB.add(g1);
		
		b1.tocar();
		v1.tocar();
		ba1.tocar();
		g1.tocar();
		
		banda.realizarShow();
		
		for (MembroBanda olho : membrosdaB) {
			System.out.println("\n Os membros da banda sao:"+ olho.getNome());
		}
		int i;
		do {
		System.out.println("Deseja estar adicionando algum outro membro?");
		System.out.println("1-------Sim");
		System.out.println("2-------Nao");
		i = entrada.nextInt();
		if (i ==1) {
				Baixista b2 = new Baixista();
				System.out.println("Qual o nome do novo membro:");
				String x = entrada.next();
				b2.setNome(x);
				membrosdaB.add(b2);
		}else if(i==2) {
			System.out.println("O show acabou");
		}
		}while (i ==2);

	}

}

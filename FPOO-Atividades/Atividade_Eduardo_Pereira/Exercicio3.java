package Atividade_Eduardo_Pereira;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int naleatorio= (int)(Math.random()*30)+1;
		int tentativa =0;
		int contador =0 ;
		do {//faça
			System.out.println("Adivinhe o numero:");
		    contador = entrada.nextInt();
		    tentativa++;
			if (contador < naleatorio) {
				System.out.println("Maior");
			}else if (contador > naleatorio) {
				System.out.println("Menor");
			}else {
				System.out.println("Parabenss!!!!");
			}
			}while (contador!= naleatorio); {
				System.out.println("Volte Sempre");
				 System.out.println("A tentativa:"+ tentativa);
			}
	}

}

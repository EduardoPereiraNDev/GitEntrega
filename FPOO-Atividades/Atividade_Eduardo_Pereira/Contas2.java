package Atividade_Eduardo_Pereira;

import java.util.Scanner;

public class Contas2 {

	public static void main(String[] args) {
		 int v,a,p,f;
		 Scanner entrada = new Scanner (System.in);
		 System.out.println("Informe valor disponivel:");
		 v = entrada.nextInt();
		 System.out.println("Informe valor disponivel:");
		 a = entrada.nextInt();
		 System.out.println("Informe valor disponivel:");
		 p = entrada.nextInt();
		 System.out.println("Informe valor disponivel:");
		 f = entrada.nextInt();
		 if (v >= a+f+p) {
			System.out.println("3");
		}else if (v >= a+f || v >= a+p ) {
			System.out.println("2");
		}else {
			System.out.println("1");
		}
	}

}

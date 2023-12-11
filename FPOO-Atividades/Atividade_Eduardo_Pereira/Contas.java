package Atividade_Eduardo_Pereira;

import java.util.Scanner;

public class Contas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Escreva o valor disponivel:");
		int v = entrada.nextInt();
		System.out.println("Escreva o valor do acougue:");
		int a = entrada.nextInt();
		System.out.println("Escreva o valor da farmacia:");
		int f = entrada.nextInt();
		System.out.println("Escreva o valor da padaria:");
		int p = entrada.nextInt(); 
		if (v > a || v >f || v>p) {
			int r = a + f ;
			int r2 = a + p ;
			int r3 = p + f ;
			if (v > r || v > r2 || v > r3) {
				int s = r + p ;
				int s2 = r2 + f ;
				int s3 = r3 + a ;
				if (v >= s || v >= s2 || v > s3) {
					System.out.println("Voce pode pagar tres contas");
				}else {
					System.out.println("Voce pode pagar duas contas");
				}
			}else {
				System.out.println("Voce pode pagar uma conta");
			}
		}else {
			System.out.println("Voce pode pagar nenhuma conta");
		}
    }
}

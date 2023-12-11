package Atividade_Eduardo_Pereira;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite o valor:");
		int num1 = entrada.nextInt();
		System.out.println("Digite o valor:");
		int num2 = entrada.nextInt();
		int mmc = calcularMMC(num1, num2);
		System.out.println("O MMC de "+ num1 +"e"+ num2 +"e"+ mmc);
	}
	public static int calcularMMC (int num1, int num2) {
		int maior = Math.max(num1, num2);
		int mmc = maior ;
		while (true) {
			if (mmc % num1 == 0 && mmc % num2 ==0) {
				break;
			}
			mmc = mmc + maior ;
		}
		return mmc;
	}

}

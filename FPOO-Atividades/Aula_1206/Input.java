package Aula_1206;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		//("criar")instancia de objeto objin
		Scanner objin = new Scanner(System.in);
		System.out.println("Digite o Valor de a:");
		int a = objin.nextInt();
		System.out.println("Digite o Valor de b:");
		int b = objin.nextInt();
		if (a > b) {
			System.out.printf ("Valor de a:%d" , a);
		}else 
			System.out.println ("%d\n" + b);
	    }

}

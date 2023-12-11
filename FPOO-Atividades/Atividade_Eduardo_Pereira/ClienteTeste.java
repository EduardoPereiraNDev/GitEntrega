package Atividade_Eduardo_Pereira;

import java.util.Scanner;

public class ClienteTeste {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		Cliente cl1 = new Cliente();
		System.out.println("Qual o seu cpf:");
		cl1.cpf = entrada.next();
		System.out.println("Qual o seu nome:");
		cl1.nome = entrada.next();
		System.out.println("Qual o seu telefone:");
		cl1.telefone = entrada.next();
		System.out.println("Qual o sua idade:");
		cl1.idade = entrada.nextInt();
		System.out.println("Qual o sua altura:");
		cl1.altura = entrada.nextDouble();
		System.out.println("Qual o seu peso:");
		cl1.peso = entrada.nextDouble();
		System.out.println("Qual o seu peso-Alvo:");
		cl1.pesoalvo = entrada.nextDouble();
		cl1.imc();
		cl1.pesoalvo();
		cl1.imprimir();
	}
}

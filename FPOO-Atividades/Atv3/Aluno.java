package Atv3;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Aluno extends Pessoa {
	Scanner entrada = new Scanner (System.in);
	private String curso;
	private float nota;
	public double media;
	
	//construtores
	public Aluno() {
		
	}
	
	public Aluno(String cur, float nota) {
		super();
		this.curso = cur;
		this.nota = nota;
	}
	//metodos
	public String getCurso() {
		return curso;
	}
	public void setCurso() {
		System.out.println("Qual o curso escolhido:");
		curso = entrada.next();
		}
	
	public float getNota() {
		return nota;
	}
	public void setNota() {
	}
	//
	public void calcularMedia() {
		System.out.println("Quantos notas vc deseja escrever?");
	    double notas = entrada.nextInt();
	    double soma = 0;
	    double[] vetor = new double [(int) notas];
		for (int i=0 ; i < notas ; i++) {
		    System.out.println("Escreva a nota:");
		    int not = entrada.nextInt();
		    vetor[i]= not;
		     soma = soma + vetor[i];
		   }	
		 media = soma/notas;
		System.out.println("A média é igual a:"+ media);;
	}
	public void situacaoFinal() {
		if ( media < 7) {
			System.out.println("Voce foi reprovado");
		}else {
			System.out.println("Voce foi aprovado");
		}
	}
}

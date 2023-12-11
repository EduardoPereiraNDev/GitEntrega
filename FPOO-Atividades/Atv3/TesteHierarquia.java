package Atv3;

import java.util.Scanner;

public class TesteHierarquia {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		Aluno alu1 = new Aluno();
		alu1.setNome();
		alu1.setEndereco();
		alu1.setTelefone();
		alu1.setCpf();
		alu1.setCelular();
		alu1.setCurso();
		alu1.calcularMedia();
		alu1.situacaoFinal();
		System.out.println("Aluno----2:");
		Aluno alu2 = new Aluno();
		alu2.setNome();
		alu2.setEndereco();
		alu2.setTelefone();
		alu2.setCpf();
		alu2.setCelular();
		alu1.setCurso();
		alu2.calcularMedia();
		alu2.situacaoFinal();
		//professores
		System.out.println("Professores:");
		Professor prof1 = new Professor();
		prof1.setNome();
		prof1.setEndereco();
		prof1.setTelefone();
		prof1.setCpf();
		prof1.setCelular();
		prof1.setNomeCurso();
		prof1.setSalario();
		System.out.println("Professor------2:");
		Professor prof2 = new Professor();
		prof2.setNome();
		prof2.setEndereco();
		prof2.setTelefone();
		prof2.setCpf();
		prof2.setCelular();
		prof2.setNomeCurso();
		prof2.setSalario();
	}
}

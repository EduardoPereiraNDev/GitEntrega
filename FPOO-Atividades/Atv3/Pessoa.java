package Atv3;

import java.util.Scanner;

public abstract class Pessoa  {
	Scanner entrada = new Scanner (System.in);
	private String nome;
	private String endereco;
	private int telefone;
	private int cpf;
	private int celular;
	//construtor
	
	public Pessoa() {
		
	}
	
	public Pessoa(String n,String ende, int tele, int cpf,int cel) {
		this.nome = n;
		this.endereco = ende;
		this.telefone =tele;
		this.cpf =cpf;
		this.celular = cel;
	}
	
	//metodos
	public String getNome() {
		return nome;
	}
	public void setNome() {
		System.out.println("Qual o seu nome:");
		nome= entrada.next();
	}
	//
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco() {
		System.out.println("Qual o seu endereco:");
		endereco= entrada.next();
	}
	//
	
	public String getTelefone() {
		return nome;
	}
	public void setTelefone() {
		System.out.println("Qual o seu telefone:");
		telefone= entrada.nextInt();
	}
	//
	
	public String getCpf() {
		return nome;
	}
	public void setCpf() {
		System.out.println("Qual o seu cpf:");
		cpf= entrada.nextInt();
	}
	//
	
	public String getCelular() {
		return nome;
	}
	public void setCelular() {
		System.out.println("Qual o seu celular:");
		celular= entrada.nextInt();
	}
	//
	
}

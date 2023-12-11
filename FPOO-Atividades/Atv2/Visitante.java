package Atv2;

import java.util.Scanner;

public class Visitante {
	Scanner entrada = new Scanner (System.in);
	private String nome ;
	private int idade ;
	private double altura;
	
	public Visitante (String nom, int pot, float alt) {
		this.nome = nom;
		this.idade = pot;
		this.altura = alt;
	}
	
	public String getnome() {
		System.out.println("O nome do visitante cadastrado e:"+ nome);
		return nome;
	} 
	public String setnome(String nom) {
		System.out.println("Digite o novo nome do visitante:");
		nom = entrada.next();
		this.nome = nom;
		return nome;
	} 
	
	public double getaltura() {
		System.out.println("A altura do visitante cadastrada e:"+ altura);
		return altura;
	} 
	public double setaltura(double alt) {
		System.out.println("Digite a nova altura do visitante:");
		alt = entrada.nextDouble();
		this.altura = alt;
		return altura;
	} 
	
	public int getidade() {
		System.out.println("A idade do visitante cadastrada e:"+ idade);
		return idade;
	} 
	public int setidade(int ida) {
		System.out.println("Digite a nova idade do visitante:");
		ida = entrada.nextInt();
		this.idade = ida;
		return idade;
	} 
	public boolean podeandar () {
		if (altura < 1.50 || idade < 10) {
			System.out.println("Não pode andar em nenhum brinquedo");
			return false;
		}else {
			System.out.println("Pode andar nos brinquedos");
			return true;
		}
	}
}

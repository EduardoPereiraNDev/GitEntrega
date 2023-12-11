package Atv2;

import java.util.Scanner;

public class Brinquedo {
	Scanner entrada = new Scanner (System.in);
	private String nome ;
	private double alturaMinima ;
	private int capacidadeMaxima ;
	
	public Brinquedo (String nom, float alt, int max) {
		this.nome = nom;
		this.alturaMinima = alt;
		this.capacidadeMaxima = max;
	}
	
	public String getNome() {
		System.out.println("O nome do brinquedo e:"+ nome);
		return nome;
	} 
	public String setNome(String nom) {
		System.out.println("Digite o novo nome do binquedo:");
		nom = entrada.next();
		this.nome = nom;
		return nome;
	} 
	
	public double getalturaMinima() {
		System.out.println("A altura minima do brinquedo e:"+ alturaMinima);
		return alturaMinima;
	} 
	public double setalturaMinima(double alt) {
		System.out.println("Digite a  nova altura minima do brinquedo :");
		alt = entrada.nextDouble();
		this.alturaMinima = alt;
		return alturaMinima;
	} 
	
	public int getcapacidadeMaxima() {
		System.out.println("A capacidade maxima e:"+ capacidadeMaxima);
		return capacidadeMaxima;
	} 
	public int setcapacidadeMaxima(int max) {
		System.out.println("Digite a nova capacidade maxima :");
		max = entrada.nextInt();
		this.capacidadeMaxima = max;
		return capacidadeMaxima;
	} 
}


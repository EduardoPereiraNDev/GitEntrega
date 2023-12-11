package Atv4;

import java.util.Scanner;

public class Vaso {
	Scanner entrada = new Scanner (System.in);
	//atri
	private String cor;
	private double tamanho;
	private String material;
	//construtor
	public Vaso() {
		
	}
	public Vaso(String cor,double tamanho,String material) {
		this.cor = cor;
		this.tamanho = tamanho;
		this.material = material;
	}
	//gett e sett
	public String getCor() {
		return cor;
	}
	public void setCor() {
		System.out.println("Digite a cor do vaso:");
		cor = entrada.next();
	}
	
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho() {
		System.out.println("Digite o tamanho do vaso:");
		tamanho = entrada.nextDouble();
	}
	
	public String getMaterial() {
		return material;
	}
	public void setMaterial() {
		System.out.println("Digite o material do vaso:");
		material = entrada.next();
	}
	//metodosespe
	public void exibir() {
		System.out.println("a cor do vaso e:"+ cor);
		System.out.println("o tamanho do vaso e:"+ tamanho);
		System.out.println("O material e:"+ material);

	}
}

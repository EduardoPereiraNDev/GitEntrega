package Atv4;

import java.util.Scanner;

public class VasoDecorado extends Vaso {
	Scanner entrada = new Scanner (System.in);
	//atri
	private String decoracao;
	//construtor
	public VasoDecorado(String decoracao) {
		super();
		super.getCor();
		super.getTamanho();
		super.getMaterial();
		this.decoracao = decoracao;
	}
	//gett e sett
	public String getDecoracao() {
		return decoracao;
	}
	public void setDecoracao() {
		System.out.println("Digite a decoracao:");
		decoracao = entrada.next();
	}
	//Metodos especiais
	@Override
	public void exibir() {
		System.out.println("a cor do vaso e:"+ super.getCor());
		System.out.println("o tamanho do vaso e:"+ super.getTamanho());
		System.out.println("O material e:"+ super.getMaterial());
		System.out.println("a decoracao e:"+ decoracao);
	}
}

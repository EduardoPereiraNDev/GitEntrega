package Atv6;

public class Quarto extends Comodo {
	private int numeroCamas;
	
	public Quarto() {
		
	}
	public Quarto(int n, String nome) {
		super();
		super.setNome(nome);
		this.numeroCamas = n ;
	}
	public int getNumeroCamas() {
		return numeroCamas;
	}
	public void setNumeroCamas(int numeroCamas) {
		this.numeroCamas = numeroCamas;
	}
}

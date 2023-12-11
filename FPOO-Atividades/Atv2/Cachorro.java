package Atv2;

public class Cachorro {
	private String nome;
	private float peso;
	private char sexo;
	private int qtdPatas;
	
	public Cachorro() {
		
	}
	public Cachorro(String nome,float peso,char sexo, int patas) {
		this.nome=nome;
		this.peso= peso;
		this.sexo= sexo;
		this.qtdPatas= patas;
	}
	
	public void latir() {
		System.out.println("AUAU");
	}
	public void correr() {
		System.out.println("Correndo");
	}
	public void dormir() {
		System.out.println("Dormindo");
	}
	public void brincar() {
		System.out.println("Brincando");
	}
}

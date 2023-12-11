package Aula_2308;

public class Cachorro extends Animal1{
	
	public Cachorro(String nome) {
		super(nome);
	}
	@Override //Sobrescrita
	public void emitirSom() {
		System.out.println("O cachorro esta latindo.....");
	}
}

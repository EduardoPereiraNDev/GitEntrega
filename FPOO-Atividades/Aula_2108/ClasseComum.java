package Aula_2108;

public class ClasseComum {
	public int numero;
	public int idade;
	
	public ClasseComum() {
		System.out.println("Acabei de nascer!!!!Fui instanciado");
	}
	public ClasseComum(int id) {
		super();
		this.idade = id;
	
	}
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}

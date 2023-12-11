package Aula_2308;

public class Animal1 {
	
	private String nome;
	//cosntrutor
	
	public Animal1(String nome) {
		this.nome=nome;
	}
	public void emitirSom() {
		System.out.println("O animal está fazendo um som");
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome= nome;
	}
}
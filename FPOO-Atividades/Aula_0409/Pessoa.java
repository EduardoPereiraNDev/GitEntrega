package Aula_0409;

public class Pessoa {
	
	public String cargo;
	public String nome;
	public int idade;
	
	public Pessoa(String cargo, String nome, int idade) {
		this.cargo = cargo;
		this.nome =nome;
		this.idade = idade;
	}
	
	public String getCargo() {
		return this.cargo;
	}
	public void setCargo() {
		this.cargo= cargo;
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome() {
		this.cargo = cargo;
	}
	
	public int getIdade() {
		return this.idade;
	}
	public void setIdade() {
		this.cargo = cargo;
	}
}

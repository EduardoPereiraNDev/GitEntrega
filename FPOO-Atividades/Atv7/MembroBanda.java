package Atv7;

public class MembroBanda {
	private String nome;

	public MembroBanda() {
		
	}
	public MembroBanda(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void tocar() {
		System.out.println("Esta tocando");
	}
}

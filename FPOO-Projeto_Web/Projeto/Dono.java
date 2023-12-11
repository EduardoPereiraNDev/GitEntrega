package Projeto;

public class Dono {
	private String nome;
	private int telefone;
	private String nomeEmpre;
	public Dono() {
		
	}
	public Dono(String nome, int telefone, String nomeEmpre) {
		this.nome = nome;
		this.telefone = telefone;
		this.nomeEmpre = nomeEmpre;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getNomeEmpre() {
		return nomeEmpre;
	}
	public void setNomeEmpre(String nomeEmpre) {
		this.nomeEmpre = nomeEmpre;
	}
	
	public void salario() {
		
	}
}

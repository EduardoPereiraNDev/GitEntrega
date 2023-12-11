package Aula_2108;

public class ClassePai  {
	protected String senha;
	protected String nome= "Rock";
	private int idade=50;
	
	public ClassePai() {
		System.out.println("Chamando construtor padrão da ClassePai"+ nome);
	}
	public void metodoImprimir() {
		System.out.println("Imprimi na ClassePai");
	}
	public void setIdade(int idade) {
		this.idade= idade;
	}
	public int getIdade() {
		return idade;
	}
	
	public String getSenha() {
		return senha;
	}
	public void SetSenha() {
		this.senha = senha;
	}
}

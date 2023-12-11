package Projeto;

public class Fornecedor {
	private String nome;
	private int produtos;
	private float preco;
	private float precoTotal;
	
	public Fornecedor() {
		
	}
	public Fornecedor(String nome, int produtos, float preco) {
		this.nome = nome;
		this.produtos = produtos;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getProdutos() {
		return produtos;
	}
	public void setProdutos(int produtos) {
		this.produtos = produtos;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public float getPrecoTotal() {
		return precoTotal;
	}
	public void setPrecoTotal(float precoTotal) {
		this.precoTotal = precoTotal;
	}
}

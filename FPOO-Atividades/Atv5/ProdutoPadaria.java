package Atv5;

public class ProdutoPadaria implements Produto {

	private String nome;
	private double preco;
	
	public ProdutoPadaria() {
		
	}
	public ProdutoPadaria(String n, double p) {
		this.nome= n;
		this.preco=p;
	}
	
	@Override
	public String getNome() {
	
		return nome;
	}

	@Override
	public double getPreco() {
		
		return preco;
	}

	@Override
	public void setNome(String n) {
		this.nome= n;
		
	}

	@Override
	public void setPreco(double p) {
		
		this.preco= p;
	}
	public void exibir() {
		System.out.println("--------------\n"+nome);
		System.out.println(preco);
	}

}

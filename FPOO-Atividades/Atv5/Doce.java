package Atv5;

public class Doce  extends ProdutoPadaria{
	public Doce (String n, double p) {
		super();
		super.setNome(n);
		super.setPreco(p);
	}
	public void misturar() {
		System.out.println("Esta misturando o doce  "+ getNome());
	}
}

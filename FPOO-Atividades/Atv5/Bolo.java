package Atv5;

public class Bolo extends ProdutoPadaria{
	public Bolo (String n, double p) {
		super();
		super.setNome(n);
		super.setPreco(p);
	}
	public void assar() {
		System.out.println("Esta assando o bolo  "+ getNome());
	}
}

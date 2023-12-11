package Atv5;

public class Pao extends ProdutoPadaria{
	public Pao (String n, double p) {
		super();
		super.setNome(n);
		super.setPreco(p);
	}
	public void assar() {
		System.out.println("Esta assando o pao  "+ getNome());
	}
}

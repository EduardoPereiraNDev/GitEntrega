package Atv6;

public class Casa {
	private String cor;
	private float preco;
	private float metragem;
	private Sala sala;
	private Quarto quarto;
	
	public Casa() {
	}
	public Casa(String cor,float preco,float metragem,Sala sala,Quarto quarto) {
		this.cor = cor;
		this.preco = preco;
		this.metragem = metragem;
		this.sala = sala;
		this.quarto = quarto;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public float getMetragem() {
		return metragem;
	}
	public void setMetragem(float metragem) {
		this.metragem = metragem;
	}
	public Sala getSala() {
		return sala;
	}
	public void setSala(Sala sala) {
		this.sala = sala;
	}
	public Quarto getQuarto() {
		return quarto;
	}
	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}
	
	public void mostrarDetalhes() {
		System.out.println("---------------------------");
		System.out.println("A cor e:"+ cor);
		System.out.println("O preco e:"+ preco);
		System.out.println("A metragem e:"+ metragem);
	//	System.out.println("A sala possui:"+ sala);
	//	System.out.println("O quarto possui:"+ quarto);
		System.out.println("---------------------------");
	}
}

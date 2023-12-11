package Atv8;

import java.time.LocalDate;

public class Voo {
	 private int numeroVoo;
	 private String origem;
	 private String destino;
	 private double preco;
	 private LocalDate dataIda;
	 private LocalDate dataVolta;
	 
	 public Voo() {
	 }
	 
	public Voo(int numeroVoo, String origem, String destino, double preco, LocalDate dataIda, LocalDate dataVolta) {
		this.numeroVoo = numeroVoo;
		this.origem = origem;
		this.destino = destino;
		this.preco = preco;
		this.dataIda = dataIda;
		this.dataVolta = dataVolta;
	}


	public int getNumeroVoo() {
		return numeroVoo;
	}
	public void setNumeroVoo(int e) {
		this.numeroVoo = e;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public LocalDate getDataIda() {
		return dataIda;
	}
	public void setDataIda(LocalDate dataIda) {
		this.dataIda = dataIda;
	}
	public LocalDate getDataVolta() {
		return dataVolta;
	}
	public void setDataVolta(LocalDate dataVolta) {
		this.dataVolta = dataVolta;
	}
	
	public void dataEstaDisponivel(){
		
	}
	public void mostrarDetalhes() {
		
	}
	 
}

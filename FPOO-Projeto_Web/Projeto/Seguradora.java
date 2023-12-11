package Projeto;

import java.util.List;

import Atv7.MembroBanda;

public class Seguradora {
	private String nomec;
	private int precoc;
	private List<Seguradora> tabelaFipe;
	private boolean seguro;
	private String condição;
	
	public Seguradora() {
		
	}
	
	public Seguradora(String n, int p, boolean seguro) {
		this.nomec= n;
		this.precoc = p;
		this.seguro = seguro;
	}
	
	public Seguradora(List<Seguradora> tabelaFipe, boolean seguro, String condição) {
		this.tabelaFipe = tabelaFipe;
		this.seguro = seguro;
		this.condição = condição;
	}
	
	public String getNomec() {
		return nomec;
	}
	public int getPrecoc() {
		return precoc;
	}
	
	public List<Seguradora> getTabelaFipe() {
		return tabelaFipe;
	}
	public void setTabelaFipe(List<Seguradora> tabelaFipe) {
		this.tabelaFipe = tabelaFipe;
	}
	public boolean isSeguro() {
		return seguro;
	}
	public void setSeguro(boolean seguro) {
		this.seguro = seguro;
	}
	public String getCondição() {
		return condição;
	}
	public void setCondição(String condição) {
		this.condição = condição;
	}
	
	public void mediaDuracao() {
		
	}
	
}

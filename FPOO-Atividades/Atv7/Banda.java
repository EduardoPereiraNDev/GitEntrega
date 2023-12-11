package Atv7;

import java.util.ArrayList;
import java.util.List;

public class Banda {
	private String nome;
	private List <MembroBanda> membros;
	
	public Banda() {
	}
	public Banda(String n,List <MembroBanda> membros) {
		this.nome = n;
		this.membros = membros;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<MembroBanda> getMembros() {
		return membros;
	}
	public void setMembros(List<MembroBanda> membros) {
		this.membros = membros;
	}
	
	public void adicionarMembros() {
		
	}
	public void realizarShow() {
		System.out.println("Esta tocando o show");
	}

}

package Aula_2108;

public class SubClasse1 extends ClassePai {
	
	
	
	public SubClasse1() {
		super();
		nome = super.nome;
		System.out.println("Imprimi na subclasse1???");
		super.metodoImprimir();
	}
}

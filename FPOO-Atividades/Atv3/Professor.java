package Atv3;

public class Professor extends Pessoa {
	
	private String nomeCurso;
	private float salario;
	
	//cosntrutores 
	public Professor() {
		
	}
	
	public Professor(String ncur, float salario) {
		super();
		this.nomeCurso = ncur;
		this.salario = salario;
	}
	
	//metodos
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso() {
		System.out.println("Qual a curso em que e dado aula?");
		nomeCurso = entrada.next();
	}
	
	public float getSalario() {
		return salario;
	}
	public void setSalario() {
		System.out.println("Qual o salario obtido?");
		salario = entrada.nextFloat();
	}
}

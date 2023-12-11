package Aula_0409;

public class Empregado2 {
	
	private int salario;
	private Pessoa funcionario;
	
	public Empregado2 () {
		System.out.println("CABO de nascer");
	}
	public Empregado2 (int salario , Pessoa funcionario) {
		System.out.println("CABO de nascer");
		this.salario = salario;
		this.funcionario = funcionario;
	}
	
	public int getSalario() {
		return salario;
	}
	
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	public Pessoa getFuncionario() {
		return funcionario;
	}
	
	public void setFuncionario(Pessoa func) {
		this.funcionario = func;
	}
}

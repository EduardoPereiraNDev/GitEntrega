package Aula_0409;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa pes1 = new Pessoa("gerente", "tia leila",55);
		Empregado2 empre = new Empregado2();
		Empregado2 empre2 = new Empregado2(15000, pes1);
		
		System.out.println("cargo:"+ pes1.cargo);
		System.out.println("salario:"+ empre2.getSalario() + empre2.getFuncionario());
	}

}

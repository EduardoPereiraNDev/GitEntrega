package Atividade_Eduardo_Pereira;

public class Cliente {
	public String cpf;
	public String nome ;
	public String telefone;
	public int idade;
	public double altura;
	public double peso;
	public double pesoalvo;
	public double imc;
	public double imprimir;
	
	public String getcpf () {
		return cpf;
		
	}
	public String getnome () {
		return nome;
		
	}
	public String settelefone () {
		return cpf;
		
	}
	public int setidade () {
		return idade;
		
	}
	public double setaltura () {
		return altura;
		
	}
	public double setpeso () {
		return peso;
		
	}
	
	public double imc() {
		double imcc = peso/(altura*altura) ;
		System.out.println("Seu imc e:"+ imcc);
		if (imcc< 18.5) {
			System.out.println("Magreza");
		}else if (imc> 25) {
			System.out.println("Sobrepeso");
		}else {
			System.out.println("Ideal");
		}
		return imc;
	}
	public double  pesoalvo() {
		double perder = peso - pesoalvo;
		System.out.println("Voce precisa emagrecer ou engordar"+ perder + "Kg");
		return peso;
	}
	public void imprimir() {
		System.out.println("Os dados são:\n-Cpf:"+ cpf );
		System.out.println("-Nome:"+ nome);
		System.out.println("-Telefone:"+ telefone);
		System.out.println("-Idade:"+ idade);
		System.out.println("-Altura:"+ altura);
		System.out.println("-Peso:"+ peso);
		System.out.println("-Peso alvo:"+ pesoalvo);
	}
}

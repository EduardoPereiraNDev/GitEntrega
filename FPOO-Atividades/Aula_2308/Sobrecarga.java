package Aula_2308;

public class Sobrecarga {
		//metodos
	//Nao esta ocorrendo Sobrecarga de metodos, pois os tipos de metodos sao DIFERENTES
	public int soma(int a, int b) {
		return a + b;
	}
	public double soma(double a, double b) {
		return a + b;
	}
	public String soma(String a, String b) {
		return a + b;
	}
	public void soma(int a , int b, int c) {
		System.out.println(a+b+c);
	}
}

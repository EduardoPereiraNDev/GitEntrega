package Aula_3008;

public class Usointerface implements InterfacePai {
	
	public String at1;
	
	@Override
	public void metodo1() {
		System.out.println("Metodo 1");
		
	}

	@Override
	public void metodo2(int x, int y) {
		int soma = x+y;
		System.out.println(soma);
	}

	@Override
	public void metodo3(int x, int y, int z) {
		int sla= x+y-z;
		System.out.println(sla);
	}
	//
	public void metodo4() {
		System.out.println("Metodo proprio");
	}
}

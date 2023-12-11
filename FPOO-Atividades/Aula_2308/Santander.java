package Aula_2308;

public class Santander extends CaixaEletronico {
	
	@Override //sobrescrita de metodo
	public void sacar(double valor) {
		valor = valor + 3.2; // taxa cobrada!!!!!!!
		System.out.println("O seu sque no santander" + "Foi ="+ valor);
	}
}

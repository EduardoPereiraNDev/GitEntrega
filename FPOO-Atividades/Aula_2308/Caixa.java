package Aula_2308;

public class Caixa extends CaixaEletronico{
	//metodo
	@Override
	public void sacar(double valor) {
		valor = valor + 0.9; // taxa cobrada!!!!!!!
		System.out.println("O seu sque na caixa economica federal " + "Foi ="+ valor);
	}
}

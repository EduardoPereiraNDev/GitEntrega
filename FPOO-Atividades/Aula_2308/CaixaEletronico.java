package Aula_2308;

public class CaixaEletronico {// serviço 24 hrs
	//atributos
	//construtores
	//getters e setters
	//metodo especial
	public void sacar(double valor) {
		valor = valor + 0.5; // taxa cobrada!!!!!!!
		System.out.println("O seu sque no caixa eletronico" + "Foi ="+ valor);
	}
}

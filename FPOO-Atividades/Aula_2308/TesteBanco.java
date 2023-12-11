package Aula_2308;

public class TesteBanco {
	public static void main (String[] args) {
	//instancia de obj
	CaixaEletronico caie = new CaixaEletronico();
	caie.sacar(150);
	
	Caixa caixa = new Caixa();
	caixa.sacar(150);
	
	
	Santander san = new Santander();
	san.sacar(150);
	
	}
}
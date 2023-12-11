package Aula_1408;

public class TesteCarro {

	public static void main(String[] args) {
		//instanciando objetos da classe carro
		Carro c1 = new Carro();
		c1.modelo="GOL G5";
		System.out.println("o modelo e:"+ c1.modelo);
		c1.setPotencia(1000);
		System.out.println("o modelo e:"+ c1.getPotencia());
		c1.getAcelerar();
		c1.getFrear();
		
		Carro c2 = new Carro();
		
		Carro c3 = new Carro("gol",40000);
	}

}

package Atv2;

public class TesteCao {

	public static void main(String[] args) {
		Cachorro cao1 = new Cachorro("tobi",10,'m',4);
		cao1.brincar();
		cao1.correr();
		cao1.latir();
		cao1.dormir();
		
		Cachorro cao2 = new Cachorro("wellig",6,'m',4);
		cao2.brincar();
		cao2.correr();
		cao2.latir();
		cao2.dormir();
		
		Cachorro cao3 = new Cachorro("jujui",15,'f',3);
		cao3.brincar();
		cao3.correr();
		cao3.latir();
		cao3.dormir();
	}

}

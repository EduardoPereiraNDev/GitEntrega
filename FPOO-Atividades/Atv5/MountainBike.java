package Atv5;

public class MountainBike implements Veiculo {
	
	int velocidade;
	int marcha;
	
	@Override
	public int mudarMarcha() {
		System.out.println("Voce mudou de marcha, a sua marcha atual e:"+ marcha);
		return marcha;
	}
	@Override
	public void acelerar() {
		velocidade = velocidade + 5;
	}
	@Override
	public void frear() {
		velocidade= velocidade - 9;
		
	}

}

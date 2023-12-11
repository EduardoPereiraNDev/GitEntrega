package Atv5;

public class SpeedBike implements Veiculo{
	int velocidade;
	int marcha;
	@Override
	public int mudarMarcha() {
		marcha = marcha + 1;
		System.out.println("Voce mudou de marcha, a sua marcha atual e:"+ marcha);
		return marcha;
	}
	@Override
	public  void acelerar() {
		velocidade = velocidade + 9;
		System.out.println("Sua velocidade e:"+ velocidade);
	}
	@Override
	public void frear() {
		velocidade= velocidade - 7;
		System.out.println("Sua velocidade e:"+ velocidade);
		if (velocidade == 0) {
			System.out.println("Voce esta parado");
		}else if(velocidade < 0) {
			System.out.println("Voce esta dando re");
		}
	}
	
	
}

package Aula_3008;

public class Tv implements ControleRemoto {
	public int volu;
	@Override
	public void ligar() {
		System.out.println("Ligou....");
	}

	@Override
	public void desligar() {
		System.out.println("Desligou....");
	}

	@Override
	public void VolumeMais(int vol) {
		volu= volu + 1;
	}

	@Override
	public void VolumeMenos(int vol) {
		volu= volu - 1;
	}

	@Override
	public int getPolegadas() {
		return 55;
	}

	@Override
	public int getVolume() {
		System.out.println(volu);
		return volu;
	}

}

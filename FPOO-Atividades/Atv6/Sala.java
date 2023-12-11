package Atv6;

public class Sala extends Comodo {
	private boolean temTV;

	public boolean GetTemTV(int i) {
		if (i==1) {
			System.out.println("Tem tv");
		}else {
			System.out.println("Nao tem tv");
		}
		return temTV;
	}
	
	
	
}

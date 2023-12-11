package Atv4;

import java.util.Scanner;

public class TesteVaso {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		VasoDecorado vaso1 = new VasoDecorado(null);
		vaso1.setCor();
		vaso1.setTamanho();
		vaso1.setMaterial();
		vaso1.setDecoracao();
		vaso1.exibir();
		
		VasoDecorado vaso2 = new VasoDecorado(null);
		vaso2.setCor();
		vaso2.setTamanho();
		vaso2.setMaterial();
		vaso2.setDecoracao();
		vaso2.exibir();
		//vaso
		Vaso vasos = new Vaso();
		vasos.setCor();
		vasos.setTamanho();
		vasos.setMaterial();
		vasos.exibir();
		
		Vaso vasos2 = new Vaso();
		vasos2.setCor();
		vasos2.setTamanho();
		vasos2.setMaterial();
		vasos2.exibir();
		
	}
}

package Atv4;

import java.util.ArrayList;
import java.util.Scanner;

import Aula_2308.Animal1;

public class TesteVaso2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		VasoDecorado vaso1 = new VasoDecorado(null);
		vaso1.setCor();
		vaso1.setTamanho();
		vaso1.setMaterial();
		vaso1.setDecoracao();
		ArrayList<String> atributos = new ArrayList<String>();
		atributos.add(vaso1.getCor());
		System.out.println("O atributo e:"+vaso1.getTamanho());
		atributos.add(vaso1.getMaterial());
		atributos.add(vaso1.getDecoracao());
		for (String string : atributos) {
			System.out.println("O atributo e:"+string); 
		}
		
		VasoDecorado vaso2 = new VasoDecorado(null);
		vaso2.setCor();
		vaso2.setTamanho();
		vaso2.setMaterial();
		vaso2.setDecoracao();
		ArrayList<String> atributos2 = new ArrayList<String>();
		atributos2.add(vaso2.getCor());
		System.out.println("O atributo e:"+vaso2.getTamanho());
		atributos2.add(vaso2.getMaterial());
		atributos2.add(vaso2.getDecoracao());
		for (String string : atributos2) {
			System.out.println("O atributo e:"+string); 
		}
		//vaso
		Vaso vasos = new Vaso();
		vasos.setCor();
		vasos.setTamanho();
		vasos.setMaterial();
		ArrayList<String> atributos3 = new ArrayList<String>();
		atributos3.add(vasos.getCor());
		System.out.println("O atributo e:"+vasos.getTamanho());
		atributos3.add(vasos.getMaterial());
		for (String string : atributos3) {
			System.out.println("O atributo e:"+string); 
		}
		
		Vaso vasos2 = new Vaso();
		vasos2.setCor();
		vasos2.setTamanho();
		vasos2.setMaterial();
		ArrayList<String> atributos4 = new ArrayList<String>();
		atributos4.add(vasos2.getCor());
		System.out.println("O atributo e:"+vasos2.getTamanho());
		atributos4.add(vasos2.getMaterial());
		for (String string : atributos4) {
			System.out.println("O atributo e:"+string); 
		}
		
	}
}

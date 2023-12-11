package Aula_2308;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TesteAnimal1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ArrayList<Animal1> animais = new ArrayList<>();
		for(int i = 0; i < 2; i++) {
			System.out.println("Digite o nome do animal"+ (i+1)+ ":");
			String nome = entrada .nextLine();
			System.out.println("Escolha o tipo de animal"+ "(Cachorro ou Gato)");
			String tipo= entrada.nextLine();
			Animal1 animal;
			if(tipo.equalsIgnoreCase("Cachorro")) {
				animal= new Cachorro(nome);
			}else if(tipo.equalsIgnoreCase("Gato")) {
				animal= new Gato1 (nome);
			}else {
			System.out.println("Tipo de animal invalido");
			animal = new Animal1 (nome);
		}
			animais.add(animal);
		//animais.add(animal);
		}
		for (Animal1 animal : animais) {
			System.out.println("Nome do animal:"+ animal.getNome());
			animal.emitirSom();
		}
	}
}
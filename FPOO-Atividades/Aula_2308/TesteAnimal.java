package Aula_2308;

public class TesteAnimal {

	public static void main(String[] args) {
		 
		Animal ani1 = new Animal();
		ani1.nome= "Pica pau";
		System.out.println("Animal criado:"+ ani1.nome);
		//Classe gato
		System.out.println("-----------------------------");
		Gato gatinho = new Gato();
		gatinho.nome = "Serjao berranteiro";
		gatinho.brincar();
		System.out.println("-----------------------------");
		Gato gatinho2 = new Gato("Julio cesar cantanari");
		gatinho2.som();
		System.out.println("-----------------------------");
		Gato gatinho3 = new Gato(5f, 2);
	}

}

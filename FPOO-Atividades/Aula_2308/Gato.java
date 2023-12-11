package Aula_2308;

public class Gato extends Animal {
	
		public String raca;
		public float peso;
		public int idade;
		//construtor
		public Gato() {
			super();
			System.out.println("Acabei de nascer, n tenho caracteristicas");
		}
		public Gato(String raca) {
			super();
			this.raca= raca;
			System.out.println("Agr tenho uma raca");
		}
		public Gato(float peso, int idade) {
			super();
			this.peso= peso;
			this.idade= idade;
			System.out.println("tenho peso e idade ");
		}
		//metodos
		public void som() {
			System.out.println("MIAUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
			super.som();
		}
}

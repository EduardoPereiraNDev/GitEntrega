package Aula_1408;

public class Carro {
	//atributos
	public String modelo ;
	private float potencia ;
	public boolean parado;
	
	public Carro() {
		System.out.println("Acabei de nascer!");
	}
	
	public Carro (String mod, float pot) {
		this.modelo = mod;
		this.potencia = pot;
		System.out.println("Atributos");
	}
	
	//métodos getters e setters
	public String getModelo() {
		return modelo;
	} 
	public void setModelo(String m) {
		modelo=m;
	}
	public float getPotencia () {
		return potencia;
		
	}
	public void setPotencia (float p) {
		potencia=p;
	}
	
	//metodos especiais
	public boolean getAcelerar () {
		if (parado==true) {
			System.out.println("Sem movimnto");
		}else {
			System.out.println("Acelerando");
		}
		return parado;
	}
	public boolean getFrear () {
		if (parado== true) {
			System.out.println("Sem movimento");
		}else {
			System.out.println("Acelerando");
		}
		return parado;
	}
	public boolean isParado() { //Testa o estado em que o veiculo se encontra
		return parado;
	}
	public void setParado(boolean pa) { // muda o estado do carro
		parado = pa;
	}
}


package Aula_2108;

public class SuperClasse {
	protected int a= 1234;
	protected int b= 6789;
	
	SuperClasse(){
		
	}
	
	public int getA() {
		return a;
	}
	public void setA(int aa) {
		this.a = aa;
	}
	public int getB() {
		return b;
	}
	public void setB(int bb) {
		this.b = bb;
	}
	
	public String toString() {
		return "Você chamou o metodo ToString da SuperClasse";
	}
}

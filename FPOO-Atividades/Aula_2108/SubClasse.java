package Aula_2108;

public class SubClasse extends SuperClasse {
	 
	protected int c;
	protected int d;
	
	public SubClasse(){
		super();
	}
	public SubClasse(int a, int b, int c, int d) {
		super.a = a;
		super.b = b;
		this.c = c;
		this.d = d;
	}
	
	public int getC() {
		return c;
	}
	public void setC(int cc) {
		this.c = cc;
	}
	public int getD() {
		return d;
	}
	public void setD(int dd) {
		this.d = dd;
	}
	
	public String toString() {
		return "Você chamou o metodo ToString da SubClasse";
	}
}

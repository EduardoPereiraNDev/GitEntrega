package Aula_2108;

public class SubClasse2 extends SubClasse1{
		public String nome2;
	public SubClasse2() {
		System.out.println("senha vista pela SubClasse2"+ senha);
		System.out.println("nome visto pela SubClasse 2"+ nome);
	}
	public String getNome2() {
		return nome2;
	}
	public void setNome2() {
		this.nome2 = nome2;
	}
}

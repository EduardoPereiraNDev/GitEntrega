package Aula_0409;

public class TesteBanco {

	public static void main(String[] args) {
		Banco banco1 = new Banco("Scoob");
		Empregado empr1 = new Empregado("Jose");
		
		System.out.println("O banco "+ banco1.getNome()+ " tem um empregado chamado "+ empr1.getNome());

	}

}

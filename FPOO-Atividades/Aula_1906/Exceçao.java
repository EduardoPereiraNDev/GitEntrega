package Aula_1906;

public class Exceçao {

	public static void main(String[] args) {
		try {
			int conta = 10 / 0;
		} catch (Exception e) {
			System.out.println (e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
			System.out.println("continuando meu codigo!");

	}

}

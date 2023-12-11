package Aula_1406;

public class ArrayList {

	public static void main(String[] args) {
		java.util.List<String> nomes= new java.util.ArrayList<String>();
		nomes.add("jose");
		nomes.add("Ana");
		for (String string : nomes) {
			System.out.println(string); 
		}
	}

}

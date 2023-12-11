package Aula_1406;
import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList<Integer> lista =new ArrayList <Integer> (5);
		
		lista.add (10);
		lista.add (20);
		lista.add (-50);
		lista.add (100);
		lista.add (35);
		lista.remove(4);
		
		for (Integer olho : lista) {
			System.out.println("numero =" + olho);
		}
		int ver_conteudo = lista.get(2);
		System.out.println("conteudo é:" + ver_conteudo);
		int tamanho =lista.size();
		System.out.println("tamabnho da lista:" + tamanho);
	}

}

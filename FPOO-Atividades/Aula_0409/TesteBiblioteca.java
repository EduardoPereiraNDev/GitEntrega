package Aula_0409;
import java.util.ArrayList;
import java.util.List;

public class TesteBiblioteca {

	public static void main(String[] args) {
		Livro l1 = new Livro ("Programacao JAVA", " Deitel");
		Livro l2 = new Livro ("UML ", "Bezerra");
		
		List<Livro> lista_livro = new ArrayList<Livro>();
		lista_livro.add(l1);
		lista_livro.add(l2);
		
		for (Livro ver_livro : lista_livro) {
			System.out.println("livros na lista: "+ ver_livro.titulo + ver_livro.autor);
		}
		
		Biblioteca bib = new Biblioteca (lista_livro);
		List <Livro> li = bib.getTotalLivros();
		for (Livro livro_ver : li) {
			System.out.println("Titulo: "+ livro_ver.titulo + "Autor: "+  livro_ver.autor);
		}
		
		
	}

}

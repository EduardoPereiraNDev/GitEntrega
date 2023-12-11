package Aula_0409;

import java.util.List;

public class Biblioteca {

		private List <Livro> livros;
		
		public Biblioteca() {
			
		}
		public Biblioteca(List <Livro> livros) {
		this.livros = livros;
		}
		
		public List<Livro> getTotalLivros() {
			return livros;
		}
}

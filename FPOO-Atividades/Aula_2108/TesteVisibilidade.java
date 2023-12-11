package Aula_2108;

import br.org.sesisp.java.EduardoPereira.ClasseExterna;

public class TesteVisibilidade {

	public static void main(String[] args) {
		
		SubClasse1 sub1 = new SubClasse1();
		System.out.println("senha vista pela subClasse1"+ sub1.senha);
		
		SubClasse2 sub2 = new SubClasse2();
		System.out.println("senha vista pela subClasse1"+ sub2.senha);
		
		ClasseExterna cx = new ClasseExterna();
		System.out.println("senha vista pela ClasseExterna"+ cx.senha);
		
		//ClassePai cp = new ClassePai();
		//cp.nome = "sei la"
	}

}

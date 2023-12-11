package Aula_0409;
import java.util.ArrayList;
import java.util.List;
public class TesteFaculdade {
	public static void main(String[] args ) {
		
		Estudante e1 = new Estudante("Joao ",10, " TIA  ");
		Estudante e2 = new Estudante("Joao1 ",11," TIA  ");
		Estudante e3 = new Estudante("Joao2 ",12, " TIA  ");
		Estudante e4 = new Estudante("Joao3 ",13, " TIA  ");
		
		List <Estudante> eTI = new ArrayList <Estudante>();
		eTI.add(e1);
		eTI.add(e2);
		
		int i2= 0;
		for (Estudante estudante: eTI) {
			System.out.printf("Posicao %d-%s %d %s", i2, estudante.nome, estudante.ra , estudante.curso);
			i2++;
		}
		List<Estudante> eEE = new ArrayList <Estudante>();
		eEE.add(e3);
		eEE.add(e4);
		
		Turma TIA = new Turma("TI", eTI);
		Turma EE = new Turma("Enge", eEE);
		
		List<Turma> tur = new ArrayList <Turma>();
		tur.add(TIA);
		tur.add(EE);
		
		for(int i = 0; i<tur.size(); i++) {
			System.out.println("nome das turmas: "+ tur.get(i).getNome());
		}
		
		Faculdade senai = new Faculdade("Senai",tur);
		System.out.println("total de estudantes da faculdade é: ");
		System.out.println(senai.getTotalEstudantes());
	}
}

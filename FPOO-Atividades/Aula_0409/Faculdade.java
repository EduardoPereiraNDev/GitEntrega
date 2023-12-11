package Aula_0409;

import java.util.List;

public class Faculdade {
		
	public String nomeFacul;
	private List <Turma> cursos;
	
	public Faculdade() {
		
	}
	public Faculdade(String nomeFacul,List <Turma> cursos) {
		this.nomeFacul = nomeFacul;
		this.cursos = cursos;
	}
	
	//public String getNomeFacul() {
	//	return nomeFacul;
	//}
	//public Turma getCursos() {
	//	return cursos;
	//}
	public int getTotalEstudantes() {
		int nEstudantes = 0;
		List<Estudante> estudante ;
		for (Turma cur : cursos) {
			estudante = cur.getEstudantes();
			for (Estudante s : estudante) {
				nEstudantes++;
			}
		}
		return nEstudantes;
	}
	
	//public void setNomeFacul(String nomeFacul) {
    //	this.nomeFacul = nomeFacul;
	//}
	//public void setCursos(Turma cursos) {
	//	this.cursos = cursos;
	//}
	
}

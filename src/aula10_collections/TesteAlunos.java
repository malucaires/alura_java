package aula10_collections;

import java.util.HashSet;
import java.util.Set;

public class TesteAlunos {

	public static void main(String[] args) {
		
		Set<String> alunos = new HashSet<>();
		alunos.add("Rodrigo Turini");
		alunos.add("Roberto Souza");
		alunos.add("Alberto Steppat");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Lopes");
		alunos.add("Sergio Aniche");
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
				
	}

}

package aula11_java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Cursos {
	
	private String nome;
	private int alunos;
	
	public Cursos(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getAlunos() {
		return alunos;
	}
	
	@Override
	public String toString() {
		return "Curso: " + this.nome + ". Alunos: " + this.alunos + ".";
	}
}

public class ExemploCursos {
	public static void main(String[] args) {
		List<Cursos> cursos = new ArrayList<Cursos>();
		cursos.add(new Cursos("Python", 45));
		cursos.add(new Cursos("JavaScript", 150));
		cursos.add(new Cursos("Java8", 113));
		cursos.add(new Cursos("C", 55));
		
		cursos.sort(Comparator.comparing(c -> c.getAlunos()));
		
		for (Cursos curso : cursos) {
			System.out.println(curso);
		}
		
		cursos.stream()
			.filter(c -> c.getAlunos()>=100)
			.forEach(c -> System.out.println(c.getNome()));
	}
}


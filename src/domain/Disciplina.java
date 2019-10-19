package domain;

import java.util.ArrayList;
import java.util.List;

import exceptions.NumeroMaximoDeAlunosExcepetions;

public class Disciplina {
	
	private String nome;
	
	private List<Aluno> alunos = new ArrayList<>();
	
	private Professor professor;
	
	public Disciplina (String nome, Professor professor) {
		this.nome = nome;
		this.professor = professor;
	}
	
	public void matricular(Aluno aluno) {
		if(alunos.size() ==  10) {
			throw new NumeroMaximoDeAlunosExcepetions("Disciplina lotada");
		}
		alunos.add(aluno);
	}
	
	public void mostraAlunos() {
		alunos.forEach(System.out::println);
		
	}
	

}

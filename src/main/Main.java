package main;

import domain.Aluno;
import domain.Disciplina;
import domain.Professor;
import repositories.UsuarioRepository;

public class Main {

	public static void main(String[] args) {
		UsuarioRepository usuarioRepository = new UsuarioRepository();
		
		
		Aluno aluno1 = new Aluno("Wesley1", "wesley123", "123.123.123.32");
		Aluno aluno2 = new Aluno("Wesley1", "wesley123", "123.123.123.32");
		
		usuarioRepository.insere(aluno1);
		usuarioRepository.insere(aluno2);
		
		Professor professor1 = new Professor("Jose", "jose123", "321.321.321.21");
		
		Disciplina disciplina = new Disciplina("Matematica", professor1);
		
		
		usuarioRepository.insere(professor1);
		
		
		System.out.println("Lista de alunos \n");
		usuarioRepository.mostraAlunos();
		
		System.out.println("Lista de professores \n");
		usuarioRepository.mostraProfessores();

	}

}

package repositories;

import java.util.ArrayList;
import java.util.List;

import domain.Aluno;
import domain.Professor;
import domain.Usuario;

public class UsuarioRepository {
	List<Usuario> usuarios = new ArrayList<>();

	public void insere(Usuario usuario) {
		usuarios.add(usuario);
	}

	public void mostraProfessores() {
		usuarios.forEach(ususario -> {
			if (ususario instanceof Professor) {
				System.out.println(ususario);
			}
		});

	}
	
	public void mostraAlunos() {
		usuarios.forEach(ususario -> {
			if (ususario instanceof Aluno) {
				System.out.println(ususario);
			}
		});

	}
}

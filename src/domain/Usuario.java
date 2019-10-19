package domain;

public class Usuario {

	String login;
	String nome;
	String cpf;
	
	public Usuario(String nome, String login, String cpf) {
		this.nome = nome;
		this.login = login;
		this.cpf = cpf;
	}
	
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		return("Nome: "+this.nome +
				"\nLogin: "+this.login +
				"\nCPF: "+this.cpf +"\n");
	}
	
}

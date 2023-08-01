package br.jus.tjro.exercicio.api;


public class LoginRequest {

	private String login;
	private String senha;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public boolean isValid() {
		return login != null && senha != null;
	}
	
}

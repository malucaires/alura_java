package aula02_bytebank;

public class Autenticacao {
	
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autenticacao(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

}

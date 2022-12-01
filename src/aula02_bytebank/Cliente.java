package aula02_bytebank;

public class Cliente implements Autenticavel {
	
	private Autenticacao autenticador;
	
	public Cliente() {
		this.autenticador = new Autenticacao(); 
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);;
	}

	@Override
	public boolean autenticacao(int senha) {
		return this.autenticador.autenticacao(senha);
	}

}

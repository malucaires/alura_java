package aula02_bytebank;

public class Administrador extends Funcionario implements Autenticavel  {

	@Override
	public double getBonificacao() {
		return 50;
	}
	
	private Autenticacao autenticador;
	
	public Administrador() {
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

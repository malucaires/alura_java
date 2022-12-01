package aula02_bytebank;

public class Gerente extends Funcionario implements Autenticavel{
	
	public double getBonificacao() {
		return super.salario;
	}
	
	private Autenticacao autenticador;
	
	public Gerente() {
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

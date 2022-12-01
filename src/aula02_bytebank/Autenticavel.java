package aula02_bytebank;

public abstract interface Autenticavel {
	
	public abstract void setSenha(int senha);

	public abstract boolean autenticacao(int senha);
}

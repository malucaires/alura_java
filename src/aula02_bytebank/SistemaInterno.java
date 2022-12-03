package aula02_bytebank;

public class SistemaInterno {
	
	private int senha = 2222;
	
	public void autentica(Autenticavel g) {
		boolean autenticou = g.autenticacao(this.senha);
		if (autenticou) {
			System.out.println("Pode entrar no sistema");
		} else {
			System.out.println("Nao pode entrar no sistema");
		}
	}

}
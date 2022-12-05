package aula08_array.banco.modelo;

public class GuardadorDeContas {
	
	private Conta[] referencias;
	private int posicaoLivre;
	
	public GuardadorDeContas() {
		this.referencias = new Conta[10];
		this.posicaoLivre = 0; 
		
	}

	public void adiciona(Conta ref) {
		this.referencias[this.posicaoLivre] = ref;
		this.posicaoLivre++;
	}

	public int getQuantidadeElementos() {
		return posicaoLivre;
	}

	public Conta getReferencia(int pos) {
		return this.referencias[pos];
	}

}

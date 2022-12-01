package aula02_bytebank;

public class ControleBonificacao {
	
	private static double soma; 
	
	public void registra(Funcionario f) {
		soma += f.getBonificacao();	
	}
	
	public double getSoma() {
		return soma;
	}
}

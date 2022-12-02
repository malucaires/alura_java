package aula05_excecoes;

public class TesteSaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(1212,14254);
		conta.deposita(200.00);
		
		try {
			conta.saca(210.00);
		} catch (SaldoInsuficienteException ex) {
			System.out.println("Exception: " + ex.getMessage());
		}
		
		
		System.out.println(conta.getSaldo());

	}

}

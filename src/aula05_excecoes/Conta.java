package aula05_excecoes;

public abstract class Conta {
	
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
		
	public Conta(int agencia, int numero) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public int getTotal() {
		return Conta.total;
	}

	public void deposita (double valor) {
		this.saldo += valor;
	}
	
	public void saca (double valor) throws SaldoInsuficienteException {
		
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ". Valor: " + valor);
		}
		
		this.saldo -= valor;
		
	}
	
	public void transfere (double valor, Conta destino) throws SaldoInsuficienteException {
		saca(valor);
		destino.deposita(valor);
	}
}

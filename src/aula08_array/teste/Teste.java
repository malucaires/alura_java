package aula08_array.teste;

import aula08_array.banco.modelo.Conta;
import aula08_array.banco.modelo.ContaCorrente;
import aula08_array.banco.modelo.GuardadorDeContas;

public class Teste {

	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cc = new ContaCorrente(1234,12345);
		guardador.adiciona(cc);
		
		Conta cc2 = new ContaCorrente(2345,23456);
		guardador.adiciona(cc2);
		
		int tamanho = guardador.getQuantidadeElementos();
		System.out.println(tamanho);
		
		Conta ref = guardador.getReferencia(1);
		System.out.println(ref.getNumero());
		

	}

}

package aula08_array.teste;

import aula08_array.banco.modelo.ContaCorrente;

public class TesteReferencias {
	
	public static void main(String[] args) {
		
		ContaCorrente[] contas = new ContaCorrente[5];
		
		ContaCorrente cc1 = new ContaCorrente(1234,12345);
		
		contas[0] = cc1;
		
		System.out.println(contas[0].getAgencia());
		
		contas[1] = new ContaCorrente(2345,23456);
		
		System.out.println(contas[1].getAgencia());
		
		contas[2] = new ContaCorrente(3456,34567);
		contas[2].setAgencia(4567);
		
		System.out.println(contas[2].getAgencia());
		
		
		
		
	}

}

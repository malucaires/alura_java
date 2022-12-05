package aula08_array.teste.util;

import java.util.LinkedList;

import aula08_array.banco.modelo.Conta;
import aula08_array.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		LinkedList<Conta> lista = new LinkedList<Conta>();
		
		Conta cc1 = new ContaCorrente(1234,12345);
		lista.add(cc1);
		
		Conta cc2 = new ContaCorrente(2345,23456);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(2345,23456);
		
		boolean existe = lista.contains(cc3);
		System.out.println("Existe? " + existe);
		
		for (Object aRef : lista) {
			System.out.println(aRef);
		}
	}

}

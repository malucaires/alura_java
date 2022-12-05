package aula08_array.teste.util;

import java.util.ArrayList;

import aula08_array.banco.modelo.Conta;
import aula08_array.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(1234,12345);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(2345,23456);
		lista.add(cc2);
		
		System.out.println(lista.size());
		
		Conta cc3 = new ContaCorrente(3456,34567);
		lista.add(cc3);
		
		Conta cc4 = new ContaCorrente(4567,45678);
		lista.add(cc4);
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println("----------------------------------------");
		
		for (Object aRef : lista) {
			System.out.println(aRef);
		}
	}

}

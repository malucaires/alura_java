package aula08_array.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteUnboxing {

	public static void main(String[] args) {
		
		int idade = 29;
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(idade); //autoboxing
		
		System.out.println(numeros);
		
	}
}

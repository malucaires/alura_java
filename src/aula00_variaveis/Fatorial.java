/*
 * Imprimir os fatoriais de 1 a 10!
 */
package aula00_variaveis;

public class Fatorial {

	public static void main(String[] args) {
		
		int fatorial = 1;
		
		for (int i = 1; i <= 10; i++) {
			fatorial *= i;
			System.out.println(i + "! = " + fatorial);			
		}

	}

}

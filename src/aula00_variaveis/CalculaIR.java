/*De 1900.0 até 2800.0, o IR é de 7.5% e pode deduzir na declaração o valor de R$ 142
De 2800.01 até 3751.0, o IR é de 15% e pode deduzir R$ 350
De 3751.01 até 4664.00, o IR é de 22.5% e pode deduzir R$ 636
*/
package aula00_variaveis;

public class CalculaIR {
	
	public static void main (String[] args) {
		
		double salario = 3300.00;
		
		if (salario < 1900.00) {
			System.out.println("Nao ha IR");
		} else if (salario <= 2800.00) {
			System.out.println("O IR e de 7.5% e pode deduzir na declacao o valor de R$ 142.00");
		} else if (salario <= 3751.00) {
			System.out.println("O IR e de 15% e pode deduzir na declaracao o valor de R$ 350.00");
		} else if (salario <= 4664.00) {
			System.out.print("O IR e de 22.5% e pode deduzir na declaracao o valor de R$ 636.00");
		} else {
			System.out.println("Valor de IR não informado");
		}
	}
	

}

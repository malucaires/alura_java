package aula03_bytebank;

public class Principal {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(111,11111);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222,22222);
		cp.deposita(200.0);
		cc.transfere(10.0, cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
		
		SeguroDeVida s = new SeguroDeVida();
		
		CalculadoraDeImposto calc = new CalculadoraDeImposto();
		calc.registra(cc);
		calc.registra(s);

	}

}

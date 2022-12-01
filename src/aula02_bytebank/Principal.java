package aula02_bytebank;

public class Principal {

	public static void main(String[] args) {
		
		Gerente nico = new Gerente();
		
		nico.setNome("Nico Steppes");
		nico.setCpf("22552447585");
		nico.setSalario(2600.00);
		
		System.out.println(nico.getSalario());
		System.out.println(nico.getBonificacao());
		
		Gerente g1 = new Gerente();
		g1.setNome("Marco");
		g1.setCpf("14744485214");
		g1.setSalario(5000.00);
		
		System.out.println(g1.getNome());
		System.out.println(g1.autenticacao(2222));
		System.out.println(g1.getSalario());
		System.out.println(g1.getBonificacao());

	}

}

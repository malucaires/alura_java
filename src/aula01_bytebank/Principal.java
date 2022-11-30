package aula01_bytebank;

public class Principal {

	public static void main(String[] args) {
		Cliente paulo = new Cliente("Paulo Silveira", "1145524857", "Desenvolvedor");

		Conta contaDoPaulo = new Conta(1452,25865);
		contaDoPaulo.setSaldo(100);
		contaDoPaulo.setTitular(paulo);
		
		Conta conta2 = new Conta(1452,14528);
		Conta conta3 = new Conta(1452,36524);
		Conta conta4 = new Conta(1452,12512);

		System.out.println(contaDoPaulo.getTitular().getNome());
		System.out.println(contaDoPaulo.getTotal());
	}

}

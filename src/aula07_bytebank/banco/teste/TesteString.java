package aula07_bytebank.banco.teste;

public class TesteString {
	
	public static void main(String[] args) {
		
		String nome = "Alura";
		
		String novoNome = nome.replace("A","a");
		
		System.out.println(nome);
		System.out.println(novoNome);
		
		char c = nome.charAt(2);
		System.out.println(c);
	}

}

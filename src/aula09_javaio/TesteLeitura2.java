package aula09_javaio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");
		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(","); 
			
			String tipoConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int conta = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();
			
			//System.out.println(tipoConta + ", " + agencia + ", " + 
			//		conta + ", " + titular + ", " + saldo);
			
			System.out.format(new Locale("pt", "BR"), "%s - %04d - %05d - %15s - R$ %07.2f %n", 
					tipoConta, agencia, conta, titular, saldo);
			
			//String[] valores = linha.split(",");
			//System.out.println(Arrays.toString(valores));
		}
		
		scanner.close();
	}

}

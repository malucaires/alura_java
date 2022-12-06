package aula09_javaio;

import java.io.IOException;
import java.io.PrintStream;

public class TesteEscrita3 {

	public static void main(String[] args) throws IOException {
		
		PrintStream ps = new PrintStream("lorem6.txt");
		
		ps.println("Lorem ipsum dolor sit amet, "
				+ "consectetur adipiscing elit, sed do eiusmod");
		
		ps.println("tempor incididunt ut labore et dolore magna aliqua. "
				+ "Ut enim ad minim veniam,");

		ps.close();
	}

}

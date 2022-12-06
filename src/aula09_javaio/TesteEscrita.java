package aula09_javaio;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {

		OutputStream fos = new FileOutputStream("lorem2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Lorem ipsum dolor sit amet, "
				+ "consectetur adipiscing elit, sed do eiusmod");
		bw.newLine();
		bw.write("tempor incididunt ut labore et dolore magna aliqua. "
				+ "Ut enim ad minim veniam,");
		bw.newLine();

		bw.close();
	}

}

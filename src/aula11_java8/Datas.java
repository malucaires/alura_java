package aula11_java8;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Datas {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate aniversario = LocalDate.of(2023, Month.APRIL, 30);
		
		Period periodo = Period.between(hoje, aniversario);
		System.out.println(periodo);
		
		
	}

}

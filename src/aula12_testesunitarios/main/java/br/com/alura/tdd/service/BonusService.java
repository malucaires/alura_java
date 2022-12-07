package aula12_testesunitarios.main.java.br.com.alura.tdd.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import aula12_testesunitarios.main.java.br.com.alura.tdd.modelo.Funcionario;

public class BonusService {

	public BigDecimal calcularBonus(Funcionario funcionario) {
		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
		if (valor.compareTo(new BigDecimal("1000")) > 0) {
			throw new IllegalArgumentException("Funcionario com salario maior de 10000,00 não recebe bonus.");
		}
		return valor.setScale(2, RoundingMode.HALF_UP);
	}

}

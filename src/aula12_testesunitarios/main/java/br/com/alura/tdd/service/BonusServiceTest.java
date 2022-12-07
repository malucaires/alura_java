package aula12_testesunitarios.main.java.br.com.alura.tdd.service;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import aula12_testesunitarios.main.java.br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
	void bonusDeveriaSerZeroParaFuncionariosComSalarioMuitoAlto() {
		BonusService service = new BonusService();
		assertThrows(IllegalArgumentException.class,
				() -> service.calcularBonus(new Funcionario ("Rodrigo", LocalDate.now(), new BigDecimal("25000"))));
		
	}
	
	@Test
	void bonusDeveriaSer10PorCentoDoSalario() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario ("Rodrigo", LocalDate.now(), new BigDecimal("2500.0")));
		assertEquals(new BigDecimal("250.00"), bonus);
	}
	
	@Test
	void bonusDeveriaSer10PorCentoParaSalarioDe10000() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario ("Rodrigo", LocalDate.now(), new BigDecimal("10000.0")));
		assertEquals(new BigDecimal("1000.00"), bonus);
	}

}

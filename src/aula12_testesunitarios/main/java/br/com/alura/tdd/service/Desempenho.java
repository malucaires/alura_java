package aula12_testesunitarios.main.java.br.com.alura.tdd.service;

import java.math.BigDecimal;

public enum Desempenho {
	ADESEJAR {
		@Override
		public BigDecimal percentualReajuste() {
			return new BigDecimal("0.03");
		}
	},  
	BOM {
		@Override
		public BigDecimal percentualReajuste() {
			return new BigDecimal("0.15");
		}
	}, 
	OTIMO {
		@Override
		public BigDecimal percentualReajuste() {
			return new BigDecimal("0.20");
		}
	};
	
	public abstract BigDecimal percentualReajuste();
	
}

package br.com.alexandre.descontos;

import java.math.BigDecimal;

import br.com.alexandre.orcamento.Orcamento;

public class CalculadoraDeDescontos {
	
	
	public BigDecimal calcular(Orcamento orcamento) {
		Descontos desconto = new DescontoPrimario
				(new DescontoSecundario
				(new SemDesconto()));
		return desconto.calcular(orcamento);
	}

}

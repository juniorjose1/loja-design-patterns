package br.com.alexandre.descontos;

import java.math.BigDecimal;

import br.com.alexandre.orcamento.Orcamento;

public class DescontoPrimario extends Descontos{
	
	protected DescontoPrimario() {
	}
	
	protected DescontoPrimario(Descontos descontos) {
		super(descontos);
	}

	@Override
	protected Boolean verificarDesconto(Orcamento orcamento) {
		return orcamento.getQuantidade() <= 10;
	}

	@Override
	protected BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}
	
	
	
	
}

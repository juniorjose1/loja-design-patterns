package br.com.alexandre.descontos;

import java.math.BigDecimal;

import br.com.alexandre.orcamento.Orcamento;

public class SemDesconto extends Descontos{

	protected SemDesconto() {
	}
	
	protected SemDesconto(Descontos descontos) {
		super(null);
	}

	@Override
	protected Boolean verificarDesconto(Orcamento orcamento) {
		return true;
	}

	@Override
	protected BigDecimal efetuarCalculo(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

	
	
	

}

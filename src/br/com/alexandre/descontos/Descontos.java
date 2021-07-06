package br.com.alexandre.descontos;

import java.math.BigDecimal;

import br.com.alexandre.orcamento.Orcamento;

public abstract class Descontos {
	
	private Descontos descontos;
	
	protected Descontos() {
	}
	
	protected Descontos(Descontos descontos) {
		this.descontos = descontos;
	}
	
	protected BigDecimal calcular(Orcamento orcamento) {
		if(verificarDesconto(orcamento)) {
			return efetuarCalculo(orcamento);
		}
		return descontos.calcular(orcamento);
	}
	
	protected abstract Boolean verificarDesconto(Orcamento orcamento);
	
	protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);
	
}

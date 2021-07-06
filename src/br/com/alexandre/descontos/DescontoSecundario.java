package br.com.alexandre.descontos;

import java.math.BigDecimal;

import br.com.alexandre.orcamento.Orcamento;

public class DescontoSecundario extends Descontos{
	
	protected DescontoSecundario() {
	}
	
	protected DescontoSecundario(Descontos descontos) {
		super(descontos);
	}
	
	@Override
	protected Boolean verificarDesconto(Orcamento orcamento) {
		return orcamento.getQuantidade() == 11;
	}
	
	@Override
	protected BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.2"));
	}

}

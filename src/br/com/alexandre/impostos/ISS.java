package br.com.alexandre.impostos;

import java.math.BigDecimal;

import br.com.alexandre.orcamento.Orcamento;

public class ISS extends TipoDeImposto {

	public ISS(TipoDeImposto tipoDeImposto) {
		super(tipoDeImposto);
	}

	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

}

package br.com.alexandre.orcamento.situacao;

import java.math.BigDecimal;

import br.com.alexandre.orcamento.Orcamento;

public class Aprovado extends SituacaoOrcamento {

	@Override
	public BigDecimal aplicarDescontoExtra(Orcamento orcamento) {
		BigDecimal desconto = orcamento.getValor().multiply(new BigDecimal("0.1"));
		return orcamento.getValor().subtract(desconto);
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}

	

}

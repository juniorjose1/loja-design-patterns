package br.com.alexandre.orcamento.situacao;

import java.math.BigDecimal;

import br.com.alexandre.orcamento.Orcamento;

public class EmAnalise extends SituacaoOrcamento {

	@Override
	public BigDecimal aplicarDescontoExtra(Orcamento orcamento) {
		BigDecimal desconto = orcamento.getValor().multiply(new BigDecimal("0.05"));
		return orcamento.getValor().subtract(desconto);
	}
	
	@Override
	public void aprovar(Orcamento orcamento) {
		orcamento.setSituacao(new Aprovado());
	}
	
	@Override
	public void reprovar(Orcamento orcamento) {
		orcamento.setSituacao(new Reprovado());
	}

}

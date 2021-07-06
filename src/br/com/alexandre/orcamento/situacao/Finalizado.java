package br.com.alexandre.orcamento.situacao;

import java.math.BigDecimal;

import br.com.alexandre.orcamento.Orcamento;

public class Finalizado extends SituacaoOrcamento {

	@Override
	public BigDecimal aplicarDescontoExtra(Orcamento orcamento) {
		return orcamento.getValor();
	}

}

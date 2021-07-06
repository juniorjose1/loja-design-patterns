package br.com.alexandre.orcamento.situacao;

import java.math.BigDecimal;

import br.com.alexandre.orcamento.Orcamento;
import br.com.alexandre.orcamento.erros.ErroSituacaoOrcamento;

public abstract class SituacaoOrcamento {
	
	public abstract BigDecimal aplicarDescontoExtra(Orcamento orcamento);
	
	public void aprovar(Orcamento orcamento) {
		throw new ErroSituacaoOrcamento("Orçamento não pode ser aprovado !");
	}
	
	public void reprovar(Orcamento orcamento) {
		throw new ErroSituacaoOrcamento("Orçamento não pode ser reprovado !");
	}
	
	public void finalizar(Orcamento orcamento) {
		throw new ErroSituacaoOrcamento("Orçamento não pode ser finalizado !");
	}

}

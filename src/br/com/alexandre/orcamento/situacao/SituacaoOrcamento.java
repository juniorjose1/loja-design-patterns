package br.com.alexandre.orcamento.situacao;

import java.math.BigDecimal;

import br.com.alexandre.orcamento.Orcamento;
import br.com.alexandre.orcamento.erros.ErroSituacaoOrcamento;

public abstract class SituacaoOrcamento {
	
	public abstract BigDecimal aplicarDescontoExtra(Orcamento orcamento);
	
	public void aprovar(Orcamento orcamento) {
		throw new ErroSituacaoOrcamento("Or�amento n�o pode ser aprovado !");
	}
	
	public void reprovar(Orcamento orcamento) {
		throw new ErroSituacaoOrcamento("Or�amento n�o pode ser reprovado !");
	}
	
	public void finalizar(Orcamento orcamento) {
		throw new ErroSituacaoOrcamento("Or�amento n�o pode ser finalizado !");
	}

}

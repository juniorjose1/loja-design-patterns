package br.com.alexandre.orcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.alexandre.orcamento.situacao.EmAnalise;
import br.com.alexandre.orcamento.situacao.Finalizado;
import br.com.alexandre.orcamento.situacao.SituacaoOrcamento;

public class Orcamento implements Orcavel {
	
	private BigDecimal valor;
	private List<Orcavel> itens;
	private SituacaoOrcamento situacao = new EmAnalise();

	public Orcamento() {
		this.itens = new ArrayList<>();
	}

	public BigDecimal getValor() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		return this.valor;
	}
	
	private void somaValores(List<Orcavel> itens) {
		this.valor = itens.stream().map(i -> i.getValor()).reduce(BigDecimal.ZERO, BigDecimal::add);
	}

	public Integer getQuantidade() {
		return this.itens.size();
	}

	public List<Orcavel> getItens() {
		return itens;
	}
	
	public void adicionarItem(Orcavel item) {
		this.itens.add(item);
		this.somaValores(this.itens);
	}

	public SituacaoOrcamento getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoOrcamento situacao) {
		this.situacao = situacao;
	}
	
	public void aprovar() {
		this.situacao.aprovar(this);
	}
	
	public void reprovar() {
		this.situacao.reprovar(this);
	}
	
	public void finalizar() {
		this.situacao.finalizar(this);
	}
	
	public BigDecimal valorComDescontoExtra() {
		return situacao.aplicarDescontoExtra(this);
	}

	public boolean isFinalizado() {
		return this.situacao instanceof Finalizado;
	}
	
	
	
	
	
	
	

}

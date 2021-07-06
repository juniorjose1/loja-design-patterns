package br.com.alexandre.orcamento;

import java.math.BigDecimal;

public class OrcamentoProxy implements Orcavel {
	
	private BigDecimal valor;
	private Orcavel orcamento;
	
	public OrcamentoProxy(Orcavel orcamento) {
		this.orcamento = orcamento;
	}
	
	public BigDecimal getValor() {
		if(this.valor == null) {
			this.valor = orcamento.getValor();
		}
		return this.valor;
	}

}

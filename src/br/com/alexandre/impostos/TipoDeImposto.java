package br.com.alexandre.impostos;

import java.math.BigDecimal;

import br.com.alexandre.orcamento.Orcamento;

public abstract class TipoDeImposto {
	
	private TipoDeImposto tipoDeImposto;
	
	public TipoDeImposto(TipoDeImposto tipoDeImposto) {
		this.tipoDeImposto = tipoDeImposto;
	}
	
	public abstract BigDecimal efetuarCalculo(Orcamento orcamento);
	
	public BigDecimal calcular(Orcamento orcamento) {
		BigDecimal imposto1 = this.efetuarCalculo(orcamento);
		BigDecimal imposto2 = BigDecimal.ZERO;
		if(tipoDeImposto != null) {
			imposto2 = tipoDeImposto.efetuarCalculo(orcamento);
		}
		return imposto1.add(imposto2);
	}

}

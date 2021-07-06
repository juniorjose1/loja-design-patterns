package br.com.alexandre.impostos;

import java.math.BigDecimal;

import br.com.alexandre.orcamento.Orcamento;

public class CalculadoraDeImposto {
	
	public static BigDecimal calcular(Orcamento orcamento, TipoDeImposto tipoDeImposto) {
		return tipoDeImposto.calcular(orcamento);
	}

}

package br.com.alexandre.orcamento;

import br.com.alexandre.http.HttpAdapter;
import br.com.alexandre.orcamento.erros.ErroSituacaoOrcamento;

public class RegistraOrcamento {
	
	private HttpAdapter httpAdapter;
	
	public RegistraOrcamento(HttpAdapter httpAdapter) {
		this.httpAdapter = httpAdapter;
	}
	
	public void registrar(Orcamento orcamento) {
		if(!orcamento.isFinalizado()) {
			throw new ErroSituacaoOrcamento("Orçamento não finalizado !");
		}
		//chamada HTTP para a API Externa
		String descricao = "ok";
		Integer quantidade = orcamento.getQuantidade();
		
		httpAdapter.post(descricao, quantidade);
	}

}

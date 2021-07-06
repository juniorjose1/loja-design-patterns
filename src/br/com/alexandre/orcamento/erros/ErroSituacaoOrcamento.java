package br.com.alexandre.orcamento.erros;

public class ErroSituacaoOrcamento extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ErroSituacaoOrcamento(String msg) {
		super(msg);
	}

}

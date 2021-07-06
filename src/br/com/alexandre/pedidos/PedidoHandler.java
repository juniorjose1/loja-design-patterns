package br.com.alexandre.pedidos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.alexandre.orcamento.Orcamento;
import br.com.alexandre.pedidos.acoes.Acao;
import br.com.alexandre.pedidos.acoes.EnviaEmail;
import br.com.alexandre.pedidos.acoes.GravaNoBD;

public class PedidoHandler {
	
	private Pedido pedido;
	
	public PedidoHandler(Pedido pedido) {
		this.pedido = pedido;
	}
	
	public void executar(List<Acao> acoes) {
		String nome = pedido.getNome();
		LocalDate data = pedido.getData();
		Orcamento orcamento = pedido.getOrcamento();
		
		acoes.forEach(a -> a.executar());
	}

}

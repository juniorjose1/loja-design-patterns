package br.com.alexandre.pedidos;

import java.time.LocalDate;

import br.com.alexandre.orcamento.Orcamento;

public class Pedido {

	private String nome;
	private LocalDate data;
	private Orcamento orcamento;

	public Pedido(String nome, LocalDate data, Orcamento orcamento) {
		this.nome = nome;
		this.data = data;
		this.orcamento = orcamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Orcamento getOrcamento() {
		return orcamento;
	}

	public void setOrcamento(Orcamento orcamento) {
		this.orcamento = orcamento;
	}

}

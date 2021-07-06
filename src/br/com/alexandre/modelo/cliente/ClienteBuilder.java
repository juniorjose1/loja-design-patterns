package br.com.alexandre.modelo.cliente;

import java.time.LocalDate;

public class ClienteBuilder {
	
	private String nome;
	private String apelido;
	private LocalDate dataNascimento;
	private Integer altura;
	
	public ClienteBuilder comNome(String nome) {
		this.nome = nome;
		return this;
	}
	
	public ClienteBuilder comApelido(String apelido) {
		this.apelido = apelido;
		return this;
	}
	
	public ClienteBuilder comDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
		return this;
	}
	
	public ClienteBuilder comAltura(Integer altura) {
		this.altura = altura;
		return this;
	}
	
	public Cliente criar() {
		return new Cliente(nome, apelido, dataNascimento, altura);
	}

}

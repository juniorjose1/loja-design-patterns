package br.com.alexandre.modelo.cliente;

import java.time.LocalDate;

public class Cliente {

	private String nome;
	private String apelido;
	private LocalDate dataNascimento;
	private Integer altura;
	
	public Cliente() {
	}

	public Cliente(String nome, String apelido, LocalDate dataNascimento, Integer altura) {
		this.nome = nome;
		this.apelido = apelido;
		this.dataNascimento = dataNascimento;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Integer getAltura() {
		return altura;
	}

	public void setAltura(Integer altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", apelido=" + apelido + ", dataNascimento=" + dataNascimento + ", altura="
				+ altura + "]";
	}
	
	

}

package br.com.alexandre.pedidos.acoes;

public class EnviaEmail implements Acao {

	@Override
	public void executar() {
		System.out.println("Enviando email...");
	}
	
	

}

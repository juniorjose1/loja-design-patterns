package br.com.alexandre.pedidos.acoes;

public class GravaNoBD implements Acao {

	@Override
	public void executar() {
		System.out.println("Gravando no BD...");
	}

}

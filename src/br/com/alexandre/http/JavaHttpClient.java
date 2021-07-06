package br.com.alexandre.http;

public class JavaHttpClient implements HttpAdapter {
	
	public void post(String descricao, Integer quantidade) {
		System.out.println("Registrando por HttpCliente");
	}

}

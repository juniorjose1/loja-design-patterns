package br.com.alexandre.testes;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import br.com.alexandre.descontos.CalculadoraDeDescontos;
import br.com.alexandre.http.JavaHttpClient;
import br.com.alexandre.impostos.CalculadoraDeImposto;
import br.com.alexandre.impostos.ICMS;
import br.com.alexandre.impostos.ISS;
import br.com.alexandre.modelo.cliente.Cliente;
import br.com.alexandre.modelo.cliente.ClienteBuilder;
import br.com.alexandre.orcamento.ItemOrcamento;
import br.com.alexandre.orcamento.Orcamento;
import br.com.alexandre.orcamento.OrcamentoProxy;
import br.com.alexandre.orcamento.RegistraOrcamento;
import br.com.alexandre.pedidos.Pedido;
import br.com.alexandre.pedidos.PedidoHandler;
import br.com.alexandre.pedidos.acoes.Acao;
import br.com.alexandre.pedidos.acoes.EnviaEmail;
import br.com.alexandre.pedidos.acoes.GravaNoBD;

public class Teste {
	
	public static void main(String[] args) {
		
		Orcamento orcamento1 = new Orcamento();
		ItemOrcamento item1 = new ItemOrcamento(new BigDecimal("100"));
		ItemOrcamento item2 = new ItemOrcamento(new BigDecimal("200"));
		orcamento1.adicionarItem(item1);
		orcamento1.adicionarItem(item2);
		
		System.out.println(orcamento1.getValor());
		
		Orcamento orcamento2 = new Orcamento();
		ItemOrcamento item3 = new ItemOrcamento(new BigDecimal("100"));
		orcamento2.adicionarItem(item3);
		orcamento2.adicionarItem(orcamento1);
		
		System.out.println(orcamento2.getValor());
		
		OrcamentoProxy proxy = new OrcamentoProxy(orcamento2);
		
		System.out.println(proxy.getValor());
		System.out.println(proxy.getValor());
		System.out.println(proxy.getValor());
		System.out.println(proxy.getValor());
		
		BigDecimal juros = CalculadoraDeImposto.calcular(orcamento1, new ISS(new ICMS(null)));
		System.out.println("Total de Juros: " + juros);
		
		CalculadoraDeDescontos calcDesc = new CalculadoraDeDescontos();
		BigDecimal descontos = calcDesc.calcular(orcamento1);
		System.out.println("Total de Descontos: " + descontos);
		
		orcamento1.aprovar();
		
		orcamento1.finalizar();
		
		System.out.println("Valor com desconto extra: " + orcamento1.valorComDescontoExtra());
		
		String nome = "Alexandre";
		LocalDate data = LocalDate.now();
		
		Pedido pedido = new Pedido(nome, data, orcamento1);
		PedidoHandler handler = new PedidoHandler(pedido);
		List<Acao> acoes = Arrays.asList(new EnviaEmail(), new GravaNoBD());
		handler.executar(acoes);
		
		RegistraOrcamento registro = new RegistraOrcamento(new JavaHttpClient());
		
		registro.registrar(orcamento1);
		
		Cliente cliente = new ClienteBuilder()
						.comNome("Alexandre")
						.comApelido("Zé")
						.comAltura(180)
						.comDataNascimento(LocalDate.now())
						.criar();
		
		System.out.println(cliente);
		
	}

}

package br.com.andrelemos.chain;

public class CalculadoDeDescontos {

	public double calcula(Orcamento orcamento) {

		/*
		 * if (orcamento.getItens().size() > 5) { return orcamento.getValor() *
		 * 0.1; } else if (orcamento.getValor() > 500.0) { return
		 * orcamento.getValor() * 0.07; }
		 * 
		 * return 0;
		 */

		/*
		 * double desconto = new
		 * DescontoPorMaisDeCincoItens().desconta(orcamento);
		 * 
		 * if (desconto == 0) { desconto = new
		 * DescontoPorMaisDeQuinhentosReais().desconta(orcamento); }
		 * 
		 * if (desconto == 0) { desconto = new
		 * DescontoPorMaisDeQuinhentosReais().desconta(orcamento); }
		 * 
		 * return desconto;
		 */

		Desconto d1 = new DescontoPorMaisDeCincoItens();
		Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
		Desconto d3 = new SemDesconto();

		d1.setProximo(d2);
		d2.setProximo(d3);

		return d1.desconta(orcamento);

	}

}

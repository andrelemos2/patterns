package br.com.andrelemos.decorator_alura;

import br.com.andrelemos.chain.Orcamento;

public class TesteDeImpostos {
	
	public static void main(String[] args) {
		
		Imposto iss = new ISS();
		
		Orcamento orcamento = new Orcamento(500.0);
		
		double valor = iss.calcula(orcamento);
		
		System.out.println(valor);
	}

}

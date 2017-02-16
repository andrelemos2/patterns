package br.com.andrelemos.chain;

import java.util.ArrayList;
import java.util.List;

public class Orcamento {

	private List<Item> itens = null;

	public Orcamento(List<Item> itens) {
		this.itens = new ArrayList<Item>();
	}

	public Orcamento(double d) {
	}

	public List<Item> getItens() {
		return itens;
	}

	public double getValor() {
		return itens.stream().mapToDouble(Item::getValor).sum();
	}

}

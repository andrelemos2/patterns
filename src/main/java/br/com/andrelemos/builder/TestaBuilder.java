package br.com.andrelemos.builder;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class TestaBuilder {
	
	@Test
	public void testaBuilder() {
		
		List<ItemNota> itens = new ArrayList<ItemNota>();
		ItemNota item = new ItemNota();
		item.setDescricao("PAstel");
		item.setPreco(10.00);
		itens.add(item);
		
		
		NotaFiscalBuilder nf = new NotaFiscalBuilder();
		nf.comEndereco("")
		.comNumeroNota(1)
		.comRazaoSocial("")
		.comItens(itens)
		.constroi();
		
		
	}

}

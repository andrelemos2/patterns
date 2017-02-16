package br.com.andrelemos.builder;

import java.util.List;

public class NotaFiscalBuilder {
	private int notaFiscalNo;
	private String razaoSocial;
	private String endereco;
	private List<ItemNota> itens;
	
	public NotaFiscalBuilder comNumeroNota(int notaFiscalNo){
		this.notaFiscalNo = notaFiscalNo;
		return this;
	}
	
	public NotaFiscalBuilder comRazaoSocial(String razaoSocial){
		this.razaoSocial = razaoSocial;
		return this;
	}
	
	public NotaFiscalBuilder comEndereco(String endereco) {
		this.endereco = endereco;
		return this;
	}
	
	public NotaFiscalBuilder comItens(List<ItemNota> itens) {
		this.itens = itens;
		return this;
	}
	
	public NotaFiscal constroi() {
		NotaFiscal nf = new NotaFiscal(notaFiscalNo, razaoSocial, endereco, itens);
		return nf;
	}
	
	
}

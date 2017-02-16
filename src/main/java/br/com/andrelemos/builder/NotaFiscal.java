package br.com.andrelemos.builder;

import java.util.List;

public class NotaFiscal {

	private int notaFiscalNo;
	private String razaoSocial;
	private String endereco;
	private List<ItemNota> itens;
	
	public NotaFiscal(int notaFiscalNo, String razaoSocial, String endereco, List<ItemNota> itens) {
		this.notaFiscalNo = notaFiscalNo;
		this.razaoSocial = razaoSocial;
		this.endereco = endereco;
		this.itens = itens;
	}

	public int getNotaFiscalNo() {
		return notaFiscalNo;
	}

	public void setNotaFiscalNo(int notaFiscalNo) {
		this.notaFiscalNo = notaFiscalNo;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public List<ItemNota> getItens() {
		return itens;
	}

	public void setItens(List<ItemNota> itens) {
		this.itens = itens;
	}

}

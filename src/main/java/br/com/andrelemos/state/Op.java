package br.com.andrelemos.state;

public class Op {

	protected int numOp;
	
	protected EstadosDaOp estadoAtual;

	public Op(int numOp) {
		this.numOp = numOp;
		this.estadoAtual = new EmAprovacao();
	}

	public int getNumOp() {
		return numOp;
	}

	public void setNumOp(int numOp) {
		this.numOp = numOp;
	}
	
	
	public void aprovacao(){
		estadoAtual.aprovacao(this);
	}
	
	public void cancelamento(){
		estadoAtual.cancelamento(this);
	}
	
	public void emissao(){
		estadoAtual.emissao(this);
	}

	

	
	
	

}

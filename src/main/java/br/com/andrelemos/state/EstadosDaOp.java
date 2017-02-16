package br.com.andrelemos.state;

public interface EstadosDaOp {
	
	void aprovacao(Op op);
	
	void emissao(Op op);
	
	void cancelamento(Op op);

}

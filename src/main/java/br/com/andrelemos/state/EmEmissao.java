package br.com.andrelemos.state;

public class EmEmissao implements EstadosDaOp {

	public void aprovacao(Op op) {
		throw new RuntimeException("Nao pode aprovar");
	}

	public void emissao(Op op) {
		System.out.println("Emitindo a op...");
		
	}

	public void cancelamento(Op op) {
		System.out.println("Cancelando op...");
		
	}

}

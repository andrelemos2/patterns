package br.com.andrelemos.state;

public class EmAprovacao implements EstadosDaOp {

	public void aprovacao(Op op) {
		System.out.println("Aprovando op...");
		
	}

	public void emissao(Op op) {
		System.out.println("Emitindo op...");
		
	}

	public void cancelamento(Op op) {
		throw new RuntimeException("Nao pode cancelar op");
		
	}

}

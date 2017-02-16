package br.com.andrelemos.state;

public class Cancelar implements EstadosDaOp{

	public void aprovacao(Op op) {
		throw new RuntimeException("Nao pode aprovar");
	}

	public void emissao(Op op) {
		throw new RuntimeException("Nao pode emitir");
	}

	public void cancelamento(Op op) {
		System.out.println("Cancelando...");
		
	}

}

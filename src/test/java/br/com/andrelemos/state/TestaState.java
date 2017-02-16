package br.com.andrelemos.state;

import br.com.andrelemos.state.Op;
import org.junit.Test;

public class TestaState {
	
	@Test
	public void fluxoOp() {
		
		Op op = new Op(10);
		
		op.aprovacao();
		
		op.emissao();
		
		
	}

}

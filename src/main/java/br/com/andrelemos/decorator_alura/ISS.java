package br.com.andrelemos.decorator_alura;

import br.com.andrelemos.chain.Orcamento;

public class ISS
		extends Imposto {

    public ISS(Imposto outroImposto) {
	super(outroImposto);
    }

    public double calcula(Orcamento orcamento) {
	return orcamento.getValor() * 0.06;
    }

    private double calculoDoOutroImposto(Orcamento orcamento) {
        return outroImposto.calcula(orcamento);
    }

}

package br.com.designpatterns.decorator;

import br.com.designpatterns.strategy.Orcamento;

public class ICMS extends Imposto {

    public ICMS(Imposto outroImposto) {
        super(outroImposto);
    }

    public ICMS() {
    }

    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.1 + calculoDoOutroImposto(orcamento);
    }

}

package br.com.designpatterns.decorator;

import br.com.designpatterns.strategy.Orcamento;

public class TesteDeImpostosComplexos {

    public static void main(String[] args) {

        Imposto iss = new ISS(new ICMS());

        Orcamento orcamento = new Orcamento(500);

        double valor = iss.calcula(orcamento);

        System.out.println(valor);
    }

}
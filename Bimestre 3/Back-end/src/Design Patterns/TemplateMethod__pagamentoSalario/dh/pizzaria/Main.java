package TemplateMethod__pagamentoSalario.dh.pizzaria;

import TemplateMethod__pagamentoSalario.dh.pizzaria.service.Cozinheiro;
import TemplateMethod__pagamentoSalario.dh.pizzaria.service.impl.CozinheiroNoVeggie;
import TemplateMethod__pagamentoSalario.dh.pizzaria.service.impl.CozinheiroVeggie;

public class Main {

    public static void main(String[] args) {
        Cozinheiro cozinheiroVeggie = new CozinheiroVeggie();
        Cozinheiro cozinheiroNoVeggie = new CozinheiroNoVeggie();

        cozinheiroVeggie.fazerPizza();
        cozinheiroNoVeggie.fazerPizza();
    }
}

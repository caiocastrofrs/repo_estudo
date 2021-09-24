package carrinhoDeCompras;

import java.util.ArrayList;

public class Carregando implements estadoCarrinho{

    carrinhoDeCompras c;
    public Carregando(carrinhoDeCompras c) {
        this.c = c;
    }

    public void addProduto(Produto p) {
        c.setConjuntoDeProdutos(p);
    }

    @Override
    public void esvaziarCarrinho() {
        System.out.println("Esvaziando...");
        c.getConjuntoDeProdutos().clear();
    }

    @Override
    public void retornarPonto() {
        c.setEstado(new Vazio(c));
    }

    @Override
    public void avancarEstado() {
        c.setEstado(new Pagando(c));
    }
}

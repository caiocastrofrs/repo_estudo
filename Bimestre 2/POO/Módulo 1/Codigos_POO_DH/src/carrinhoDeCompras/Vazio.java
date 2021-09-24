package carrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class Vazio implements estadoCarrinho{

    carrinhoDeCompras c;
    public Vazio(carrinhoDeCompras c) {
        this.c = c;
    }

    @Override
    public void addProduto(Produto p) {
        c.setConjuntoDeProdutos(p);
        avancarEstado();
    }

    @Override
    public void esvaziarCarrinho() { System.out.println("Carrinho já esta vazio!");}

    @Override
    public void retornarPonto() {System.out.println("Vazio é o primeiro ponto");}

    @Override
    public void avancarEstado() {c.setEstado(new Carregando(c));}
}

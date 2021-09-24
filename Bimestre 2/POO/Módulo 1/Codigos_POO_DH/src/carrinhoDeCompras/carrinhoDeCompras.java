package carrinhoDeCompras;

import java.util.ArrayList;

public class carrinhoDeCompras implements estadoCarrinho{

    estadoCarrinho estado = new Vazio(this);
    ArrayList<Produto> conjuntoDeProdutos = new ArrayList<>();

    public estadoCarrinho getEstado() {
        return estado;
    }

    public void setEstado(estadoCarrinho estado) {
        this.estado = estado;
    }

    public ArrayList<Produto> getConjuntoDeProdutos() {
        return conjuntoDeProdutos;
    }

    public void setConjuntoDeProdutos(Produto p) {
        this.conjuntoDeProdutos.add(p);
    }

    public carrinhoDeCompras() {}

    @Override
    public void addProduto(Produto p) {
        this.estado.addProduto(p);
    }

    @Override
    public void esvaziarCarrinho() {
        this.estado.esvaziarCarrinho();
    }

    @Override
    public void retornarPonto() {
        this.estado.retornarPonto();
    }

    @Override
    public void avancarEstado() {
        this.estado.avancarEstado();
    }

}

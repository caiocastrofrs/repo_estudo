package carrinhoDeCompras;

public class Fechado implements estadoCarrinho{

    carrinhoDeCompras c;
    public Fechado(carrinhoDeCompras c) {
        this.c = c;
    }

    @Override
    public void addProduto(Produto p) {
        c.setEstado(new Vazio(c));
    }

    @Override
    public void esvaziarCarrinho() {
        System.out.println();
    }

    @Override
    public void retornarPonto() {

    }

    @Override
    public void avancarEstado() {

    }
}

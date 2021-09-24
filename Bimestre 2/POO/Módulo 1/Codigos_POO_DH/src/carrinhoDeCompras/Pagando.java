package carrinhoDeCompras;

public class Pagando implements estadoCarrinho{

    carrinhoDeCompras c;
    public Pagando(carrinhoDeCompras c) {
        this.c = c;
    }

    @Override
    public void addProduto(Produto p) {
        System.out.println("Não é possível adicionar produtos, já está pagando!");
    }

    @Override
    public void esvaziarCarrinho() {
        System.out.println("Esvaziando carrinho");
    }

    @Override
    public void retornarPonto() {
        c.setEstado(new Carregando(c));
    }

    @Override
    public void avancarEstado() {
        c.setEstado(new Fechado(c));
    }
}

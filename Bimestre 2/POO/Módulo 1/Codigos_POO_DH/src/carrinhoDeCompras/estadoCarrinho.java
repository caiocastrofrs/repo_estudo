package carrinhoDeCompras;

public interface estadoCarrinho {

    public void addProduto(Produto p);
    public void esvaziarCarrinho();
    public void retornarPonto();
    public void avancarEstado();
}

package Aula22;

import java.util.ArrayList;

public class Combo implements Carrinho{

    ArrayList<Carrinho> listaProdutos;

    public Combo() {
        this.listaProdutos = new ArrayList<>();
    }
    @Override
    public double calcularPreco(){
        double valorTotal = 0;

        for (Carrinho carrinho : this.listaProdutos) {
            valorTotal += carrinho.calcularPreco();
        }
        return valorTotal;
    }

    public void addProduto(Carrinho carrinho) {
        listaProdutos.add(carrinho);
    }
}

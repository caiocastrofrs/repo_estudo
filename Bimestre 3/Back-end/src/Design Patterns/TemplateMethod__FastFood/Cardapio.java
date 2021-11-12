package TemplateMethod__FastFood;

public abstract class Cardapio {
    private double precoBase;

    public Cardapio(double precoBase) {
        this.precoBase = precoBase;
    }

    public double getprecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double valor) {
        this.precoBase = valor;
    }

    public void montarCardapio() {
        montar();
        System.out.println("Preço de venda: " + calcularPrecoVenda());
    }

    public abstract void montar();
    public abstract double calcularPrecoVenda();
}

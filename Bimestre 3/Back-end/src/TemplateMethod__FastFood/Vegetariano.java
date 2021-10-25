package FastFood;

public class Vegetariano extends Cardapio{

    private double precoEmbalagemEspecial;
    public Vegetariano(double precoBase, double precoEmbalagemEspecial) {
        super(precoBase);
        this.precoEmbalagemEspecial = precoEmbalagemEspecial;
    }

    public void montar() {
        System.out.println("Montando cardápio vegetariano com embalagem especial e condimentos");
    }

    public double calcularPrecoVenda() {
        return (getprecoBase()* 1.01) + this.precoEmbalagemEspecial;
    }
}

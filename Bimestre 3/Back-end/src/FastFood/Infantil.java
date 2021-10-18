package FastFood;

public class Infantil extends Cardapio{

    private double custoBrinquedo;
    public Infantil(double precoBase, double custoBrinquedo) {
        super(precoBase);
        this.custoBrinquedo = custoBrinquedo;
    }

    @Override
    public void montar() {
        System.out.println("Montando cardápio Infantil com presente surpresa");
    }

    @Override
    public double calcularPrecoVenda() {
        return getprecoBase() + this.custoBrinquedo;
    }
}

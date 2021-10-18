package FastFood;

public class Adulto extends Cardapio{


    public Adulto(double precoBase) {
        super(precoBase);
    }

    @Override
    public void montar() {
        System.out.println("Montando cardápio adulto");
    }

    public double calcularPrecoVenda(){
        return getprecoBase();
    }
}

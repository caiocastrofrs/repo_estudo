package Figura.src;

public class Quadrado extends Figura {

    public Quadrado(int tamanho) {
        super(tamanho);
    }
    @Override
    public double calcularPerimetro() {
        return 4 * this.getTamanho();
    }
}

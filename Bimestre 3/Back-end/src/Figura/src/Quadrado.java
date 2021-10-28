public class Quadrado extends Figuras {

    public Quadrado(int tamanho) {
        super(tamanho);
    }
    @Override
    public double calcularPerimetro() {
        return 4 * this.getTamanho();
    }
}

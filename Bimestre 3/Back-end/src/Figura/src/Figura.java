public abstract class Figura {
    private int tamanho;

    public Figura(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public abstract double calcularPerimetro();
}

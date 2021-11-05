package Figura.src;

public class Circulo extends Figura {

    public Circulo(int tamanho) {
        super(tamanho);
    }

    @Override
    public double calcularPerimetro() {
        double pi = 3.14;
        double raio = this.getTamanho() / (pi*2)  ;
        return 2 * pi * raio;
    }
}

package Aula22_Mesa;

public class Circulo implements Trem{

    private double area;
    private double raio;
    private double pi = 3.14;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        this.area = this.raio * this.raio * this.pi;
        return this.area;
    }
}

package Aula22_Mesa;

public class Retangulo implements Trem{

    private double area;
    private double altura;
    private double largura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
       this.area = this.altura * this.largura;
       return this.area;
    }
}

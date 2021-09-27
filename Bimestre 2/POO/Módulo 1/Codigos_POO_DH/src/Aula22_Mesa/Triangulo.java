package Aula22_Mesa;

public class Triangulo implements Trem{

    private double area;
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        this.area = this.base * this.altura / 2;
        return this.area;
    }
}

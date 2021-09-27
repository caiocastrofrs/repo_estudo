package Aula22_Mesa;

public class Principal {
    public static void main(String[] args) {
        Conjunto vagao = new Conjunto();
        Conjunto locomotiva = new Conjunto();

        Retangulo retangulo = new Retangulo(5,4);
        Circulo circulo1 = new Circulo(1);
        Circulo circulo2 = new Circulo(1);
        Circulo circulo3 = new Circulo(1);

        Retangulo retangulo2 = new Retangulo(6,4);
        Circulo circulo4 = new Circulo(1);
        Circulo circulo5 = new Circulo(1);
        Triangulo triangulo = new Triangulo(2,2);

        retangulo2.calcularArea();
        circulo4.calcularArea();
        circulo5.calcularArea();
        triangulo.calcularArea();

        retangulo.calcularArea();
        circulo1.calcularArea();
        circulo2.calcularArea();
        circulo3.calcularArea();

        locomotiva.addConjunto(retangulo2);
        locomotiva.addConjunto(circulo4);
        locomotiva.addConjunto(circulo5);
        locomotiva.addConjunto(triangulo);

        vagao.addConjunto(retangulo);
        vagao.addConjunto(circulo1);
        vagao.addConjunto(circulo2);
        vagao.addConjunto(circulo3);

        System.out.println(vagao.calcularArea());
        System.out.println(locomotiva.calcularArea());


    }
}

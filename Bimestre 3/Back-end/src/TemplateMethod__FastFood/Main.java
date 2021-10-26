package TemplateMethod__FastFood;
//EXERCICIO - MESA DE TRABALHO
//AULA 02 - TEMPLATE METHOD PATTERN
public class Main {

    public static void main(String[] args) {
        Cardapio cardapio = new Adulto(50.50);
        cardapio.montarCardapio();
        cardapio = new Infantil(50.50,23.50);
        cardapio.montarCardapio();
        cardapio = new Vegetariano(50.50, 5.00);
        cardapio.montarCardapio();
    }
}

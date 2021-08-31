package Aula10;

public class Associado {
    private String numAssociado;
    private String nome;
    private double valorMensal;
    private String atividade;

    public Associado(String numAssociado, String nome, double valor, String atividade) {
        this.numAssociado = numAssociado;
        this.nome = nome;
        this.valorMensal = valor;
        this.atividade = atividade;
    }

    public double custoMensal() {
        return this.valorMensal;
    }
}

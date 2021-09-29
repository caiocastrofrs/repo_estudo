package Cursos;

public class Frontend implements Curso{
    private String nome;
    private int descricao;
    private int cargaHoraria;
    private double valorHora;

    public Frontend(String nome, int descricao, int cargaHoraria, double valorHora) {
        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.valorHora = valorHora;
    }

    @Override
    public double getPreco() {
        return this.cargaHoraria * this.valorHora * this.descricao;
    }

    @Override
    public String getRelatorio() {
        return this.nome + " tem uma carga horária de " +
                this.cargaHoraria +
                " horas mensais durante" +
                this.descricao +
                "com o " +
                "preço de " +
                this.valorHora +
                " reais por hora, ou seja tem um preço de " +
                getPreco() +
                " reais";
    }
}

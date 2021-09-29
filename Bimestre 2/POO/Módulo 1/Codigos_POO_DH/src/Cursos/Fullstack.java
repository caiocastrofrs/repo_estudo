package Cursos;

import java.util.ArrayList;

public class Fullstack implements Curso{
    private String nome;
    private String descricao;
    private int cargaHoraria;
    private double valorHora;
    private ArrayList<Curso> listaCursos = new ArrayList<>();

    public Fullstack(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    @Override
    public double getPreco() {
        return this.listaCursos.stream().mapToDouble(curso -> curso.getPreco()).sum() * 0.8;
//        double valor = 0;
//        for (Curso curso: this.listaCursos) {
//            valor += curso.getPreco();
//        }
//        return valor;
    }

    @Override
    public String getRelatorio() {
        return "O programa intensivo " + this.nome + " que tem ambas as disciplinas e " +
                "cuja porcentagem de bônus é de 20% tem um preço final de " +
                getPreco();
    }
    public void addCurso(Curso curso) {
        listaCursos.add(curso);
    }

    public void removerCurso(Curso curso) {
        listaCursos.remove(curso);
    }
}

package ExercicioAula06;

import java.util.Calendar;

public class Adocao {
    private boolean aptoParaAdocao;
    private String raca;
    private int ano_nascimento;
    private double peso;
    private boolean possuiChip;
    private boolean estaFerido;
    private String nome;


    public Adocao(String nome, int ano_nascimento, String raca, double peso, boolean possueChip, boolean estaFerido) {
        new Adocao(nome, ano_nascimento, raca, peso);
        this.possuiChip = possueChip;
        this.estaFerido = estaFerido;
    }
    public Adocao(String nome, int ano_nascimento, String raca, double peso) {
        this.nome = nome;
        this.ano_nascimento = ano_nascimento;
        this.raca = raca;
        this.peso = peso;
        setAptoParaAdocao();
    }

    public int getIdadeCachorro() {
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        return anoAtual - ano_nascimento;
    }

    public boolean possuiChip() {
        return this.possuiChip;
    }

    public void setAptoParaAdocao() {
        if((!estaFerido) && (peso > 5)) {
            this.aptoParaAdocao = true;
        }else {
            this.aptoParaAdocao = false;
        }
    }

    public boolean isAptoParaAdocao() {
        return aptoParaAdocao;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getAno_nascimento() {
        return ano_nascimento;
    }

    public void setAno_nascimento(int ano_nascimento) {
        this.ano_nascimento = ano_nascimento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isPossuiChip() {
        return possuiChip;
    }

    public void setPossuiChip(boolean possuiChip) {
        this.possuiChip = possuiChip;
    }

    public boolean isEstaFerido() {
        return estaFerido;
    }

    public void setEstaFerido(boolean estaFerido) {
        this.estaFerido = estaFerido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

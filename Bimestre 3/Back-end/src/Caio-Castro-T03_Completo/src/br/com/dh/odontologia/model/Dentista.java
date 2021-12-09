package br.com.dh.odontologia.model;

public class Dentista {

    private Integer id;
    private String numeroMatricula;
    private String nome;
    private String sobrenome;

    public Dentista(String numeroMatricula, String nome, String sobrenome) {
        this.numeroMatricula = numeroMatricula;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

}

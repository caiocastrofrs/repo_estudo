package com.Odontologia.OdontoProject.entity;


import javax.persistence.*;

@Entity
@Table(name = "dentistas")
public class Dentista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String sobrenome;
    private Integer matricula;

    public Dentista() {
    }

    public Dentista(String nome, String sobrenome, Integer matricula) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.matricula = matricula;
    }

    public Dentista(Integer id, String nome, String sobrenome, Integer matricula) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.matricula = matricula;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public Integer getMatricula() {
        return matricula;
    }


    @Override
    public String toString() {
        return "Dentista{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", matricula=" + matricula +
                '}';
    }

}

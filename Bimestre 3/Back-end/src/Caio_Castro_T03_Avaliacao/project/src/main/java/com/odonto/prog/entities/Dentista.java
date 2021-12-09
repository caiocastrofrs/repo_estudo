package com.odonto.prog.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "dentistas")
public class Dentista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String sobrenome;
    private Integer matricula;
    @OneToMany(mappedBy = "dentista", fetch = FetchType.LAZY)
    private Set<Consulta> consultas = new HashSet<>();

    public Dentista() {}

    public Dentista(String nome, String sobrenome, Integer matricula) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.matricula = matricula;
    }

    public Set<Consulta> getConsultas() {
        return consultas;
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }
}

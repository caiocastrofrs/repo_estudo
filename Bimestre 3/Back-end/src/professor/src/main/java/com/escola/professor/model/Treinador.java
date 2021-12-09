package com.escola.professor.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "treinadores")
public class Treinador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    @OneToMany(mappedBy = "treinador", fetch = FetchType.LAZY)
    private Set<Jogador> jogadores = new HashSet<>();

    public Treinador(Integer id, String nome, Set<Jogador> jogadores) {
        this.id = id;
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public Treinador() {}

    public Treinador(String nome, Set<Jogador> jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Set<Jogador> getJogadores() {
        return jogadores;
    }
}

package com.odonto.prog.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String email;
    private Integer acesso;
    @OneToMany(mappedBy = "dentista", fetch = FetchType.LAZY)
    private Set<Consulta> consultas = new HashSet<>();

    public Usuario(String nome, String email, Integer acesso) {
        this.nome = nome;
        this.email = email;
        this.acesso = acesso;
    }

    public Usuario(){}

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAcesso() {
        return acesso;
    }

    public void setAcesso(Integer acesso) {
        this.acesso = acesso;
    }
}

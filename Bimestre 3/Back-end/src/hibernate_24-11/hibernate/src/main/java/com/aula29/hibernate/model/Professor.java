package com.aula29.hibernate.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String curso;
    @OneToMany(mappedBy = "professor", fetch = FetchType.LAZY)
    private Set<Aluno> alunos = new HashSet<>();

    public Professor(){}

    public Professor(String nome, String curso, Set<Aluno> alunos) {
        this.nome = nome;
        this.curso = curso;
        this.alunos = alunos;
    }

    public Professor(Long id, String nome, String curso, Set<Aluno> alunos) {
        this.id = id;
        this.nome = nome;
        this.curso = curso;
        this.alunos = alunos;
    }
}

package com.example.demo.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "pacientes")
public class Paciente {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String sobrenome;
    private String cpf;
    private Date dataCad;
    //CHAVE ESTRANGEIRA DA ENTIDADE ENDEREÇO
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;
    //MAPEANDO PACIENTES PORQUE ELA É CHAVE ESTRANGEIRA EM OUTRA TABELA
    @OneToMany(mappedBy = "paciente", fetch = FetchType.LAZY)
    private Set<Consulta> consultas = new HashSet<>();


    public Paciente() {
    }

    public Paciente(String nome, String sobrenome, String cpf, Date dataCad, Endereco endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.dataCad = dataCad;
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataCad() {
        return dataCad;
    }

    public void setDataCad(Date dataCad) {
        this.dataCad = dataCad;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}

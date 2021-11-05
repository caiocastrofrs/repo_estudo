package br.com.dh.odontologia.model;

import java.util.Date;

public class Paciente {

    private Integer id;
    private String nome;
    private String sobrenome;
    private String rg;
    private Date data;
    private Endereco endereco;

    public Paciente(Integer id, String nome, String sobrenome, String rg, Date data, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.data = data;
        this.endereco = endereco;
    }

    //Construtor sem ID para caso de inserções com AUTO_INCREMENT
    public Paciente(String nome, String sobrenome, String rg, Date data, Endereco endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.data = data;
        this.endereco = endereco;
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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", rg='" + rg + '\'' +
                ", data=" + data +
                ", endereco=" + endereco +
                '}';
    }
}


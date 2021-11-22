package com.aula18.padraoMVC.odontologo.model;

public class Dentista {

    private String nome;

    public Dentista(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

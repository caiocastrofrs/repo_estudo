package com.odonto.prog.dto;

import com.odonto.prog.entities.Dentista;


public class DentistaDTO {

    private Integer id;
    private String nome;
    private String sobrenome;
    private Integer matricula;


    public DentistaDTO(Dentista dentista) {
        this.id = dentista.getId();
        this.nome = dentista.getNome();
        this.sobrenome = dentista.getSobrenome();
        this.matricula = dentista.getMatricula();
    }

    public DentistaDTO(){}

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

}

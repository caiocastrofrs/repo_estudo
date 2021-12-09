package com.odonto.prog.dto;

import com.odonto.prog.entities.Endereco;

public class EnderecoDTO {


    private Integer id;
    private String rua;
    private String numero;
    private String cidade;
    private String estado;

    public EnderecoDTO(Endereco endereco) {
        this.id = endereco.getId();
        this.rua = endereco.getRua();
        this.numero = endereco.getNumero();
        this.cidade = endereco.getCidade();
        this.estado = endereco.getEstado();
    }

    public EnderecoDTO(){}

    public Integer getId() {
        return id;
    }

    public String getRua() {
        return rua;
    }

    public String getNumero() {
        return numero;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }
}

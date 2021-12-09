package com.odonto.prog.dto;

import com.odonto.prog.entities.Endereco;
import com.odonto.prog.entities.Paciente;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Date;

public class PacienteDTO implements Serializable {
    private Integer id;
    private String nome;
    private String sobrenome;
    private String cpf;
    private Date dataCad;
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Endereco endereco;

    public PacienteDTO(Paciente paciente) {
        this.id = paciente.getId();
        this.nome = paciente.getNome();
        this.sobrenome = paciente.getSobrenome();
        this.cpf = paciente.getCpf();
        this.dataCad = paciente.getDataCad();
        this.endereco = paciente.getEndereco();
    }

    public PacienteDTO() {}


    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public Date getDataCad() {
        return dataCad;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}

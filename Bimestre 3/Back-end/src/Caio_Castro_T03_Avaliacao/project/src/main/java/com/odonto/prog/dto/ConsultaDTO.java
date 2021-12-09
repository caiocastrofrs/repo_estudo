package com.odonto.prog.dto;

import com.odonto.prog.entities.Consulta;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Date;

public class ConsultaDTO implements Serializable {

    private Integer id;
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Integer pacienteId;
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Integer dentistaId;
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Integer usuarioId;
    private Date dataCad;

    public ConsultaDTO(Consulta consulta) {
        this.id = consulta.getId();
        this.pacienteId = consulta.getPaciente().getId();
        this.dentistaId = consulta.getDentista().getId();
        this.usuarioId = consulta.getUsuario().getId();
        this.dataCad = consulta.getDataCad();
    }

    public ConsultaDTO() {}

    public Integer getId() {
        return id;
    }

    public Integer getPacienteId() {
        return pacienteId;
    }

    public Integer getDentistaId() {
        return dentistaId;
    }

    public Integer getUsuarioId() {
        return usuarioId;
    }

}

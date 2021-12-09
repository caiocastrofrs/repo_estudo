package com.cassino.apostas.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "partidas")
public class Partida implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    private String status;
    @DBRef
    private Time timeLocal;
    @DBRef
    private Time timeVisitante;

    public Partida() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Time getTimeLocal() {
        return timeLocal;
    }

    public void setTimeLocal(Time timeLocal) {
        this.timeLocal = timeLocal;
    }

    public Time getTimeVisitante() {
        return timeVisitante;
    }

    public void setTimeVisitante(Time timeVisitante) {
        this.timeVisitante = timeVisitante;
    }
}

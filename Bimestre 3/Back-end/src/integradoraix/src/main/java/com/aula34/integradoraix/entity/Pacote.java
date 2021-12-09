package com.aula34.integradoraix.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "pacotes")
public class Pacote implements Serializable {

    @Id
    private String id;
    private String codigo;
    private String nome;
    private Estado estado;
    private Destino destino;


}

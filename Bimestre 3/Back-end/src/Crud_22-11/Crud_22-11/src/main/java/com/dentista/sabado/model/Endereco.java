package com.dentista.sabado.model;

public class Endereco {
    private Integer id;
    private String rua;
    private String numero;
    private String cidade;
    private String estado;


    public Endereco() {}

    // Construtor c/ todos os parametros
    public Endereco(Integer id, String rua, String numero, String bairro, String cidade) {
        this.id = id;
        this.rua = rua;
        this.numero = numero;
        this.estado = bairro;
        this.cidade = cidade;
    }

    // Construtor c/ todos os parametros - menos o ID
    public Endereco(String rua, String numero, String bairro, String cidade) {
        this.rua = rua;
        this.numero = numero;
        this.estado = bairro;
        this.cidade = cidade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }


    public String getNumero() {
        return numero;
    }


    public String getEstado() {
        return estado;
    }


    public String getCidade() {
        return cidade;
    }


    @Override
    public String toString() {
        return "Endereco{" +
                "id=" + id +
                ", rua='" + rua + '\'' +
                ", numero='" + numero + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}

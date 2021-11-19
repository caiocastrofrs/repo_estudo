package br.com.dh.odontologia.model;

public class Endereco {

    private Integer id;
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;

    // Construtor c/ todos os parametros
    public Endereco(Integer id, String rua, String numero, String bairro, String cidade) {
        this.id = id;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
    }


    // Construtor c/ todos os parametros - menos o ID
    public Endereco(String rua, String numero, String bairro, String cidade) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
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


    public String getBairro() {
        return bairro;
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
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                '}';
    }

}

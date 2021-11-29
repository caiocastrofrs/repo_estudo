package com.dentista.sabado.model;

public class Usuario {
    private Integer id;
    private String nome;
    private String email;
    private String senha;
    private Integer acesso;

    public Usuario() {}

    public Usuario(String nome, String email, String senha, Integer acesso) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.acesso = acesso;
    }

    public Usuario(Integer id, String nome, String email, String senha, Integer acesso) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.acesso = acesso;
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

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public Integer getAcesso() {
        return acesso;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", acesso=" + acesso +
                '}';
    }
}

package com.odonto.prog.dto;

import com.odonto.prog.entities.Usuario;

public class UsuarioDTO {

    private Integer id;
    private String nome;
    private String email;
    private Integer acesso;

    public UsuarioDTO(Usuario usuario) {
        this.id = usuario.getId();
        this.nome = usuario.getNome();
        this.email = usuario.getEmail();
        this.acesso = usuario.getAcesso();
    }

    public UsuarioDTO(){}

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public Integer getAcesso() {
        return acesso;
    }
}

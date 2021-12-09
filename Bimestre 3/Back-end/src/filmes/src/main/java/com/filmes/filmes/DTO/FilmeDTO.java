package com.filmes.filmes.DTO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.filmes.filmes.Model.Filme;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FilmeDTO {

    private String titulo;
    private String categoria;

    public FilmeDTO(String titulo, String categoria) {
        this.titulo = titulo;
        this.categoria = categoria;
    }


    public FilmeDTO entidadeDTO(Filme filme) {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.convertValue(filme, FilmeDTO.class);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}

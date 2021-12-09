package com.filmes.filmes.Model;

import java.util.ArrayList;
import java.util.List;

public class Filmes {

    private List<Filme> filmes = new ArrayList<>();

    public List<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(Filme filme) {
        this.filmes.add(filme);
    }

    @Override
    public String toString() {
        return "Filmes{" +
                "filmes=" + filmes +
                '}';
    }
}

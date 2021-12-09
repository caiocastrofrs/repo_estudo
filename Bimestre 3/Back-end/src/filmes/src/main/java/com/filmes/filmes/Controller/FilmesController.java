package com.filmes.filmes.Controller;

import com.filmes.filmes.DTO.FilmeDTO;
import com.filmes.filmes.Model.Filme;
import com.filmes.filmes.Model.Filmes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmesController {

    @GetMapping("/listarFilmesDTO")
    public List<FilmeDTO> listarFilmesDTO() {
        Filmes filmes = new Filmes();
        List<FilmeDTO> filmesDTO = new ArrayList<>();
        for (Filme filme : filmes.getFilmes()) {
            filmesDTO.add(new FilmeDTO(filme.getTitulo(), filme.getCategoria()).entidadeDTO(filme));
        }
        return filmesDTO;
    }

    @GetMapping("/listarFilmes")
    public List<Filme> listarFilmes() {
        Filme filme = new Filme("caio titulo","categoria caio",2,1);
        Filme filme2 = new Filme("caio titulo 2","categoria caio 2",3,2);
        Filme filme3 = new Filme("caio titulo 3","categoria caio 3",4,3);
        Filme filme4 = new Filme("caio titulo 4","categoria caio 4",5,4);
        Filme filme5 = new Filme("caio titulo 5","categoria caio 5",6,5);
        Filmes filmes = new Filmes();
        filmes.setFilmes(filme);
        filmes.setFilmes(filme2);
        filmes.setFilmes(filme3);
        filmes.setFilmes(filme4);
        filmes.setFilmes(filme5);

        return filmes.getFilmes();
    }

}

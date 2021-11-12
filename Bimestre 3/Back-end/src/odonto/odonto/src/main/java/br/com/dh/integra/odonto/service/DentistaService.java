package br.com.dh.integra.odonto.service;

import br.com.dh.integra.odonto.domain.Dentista;

import java.util.List;

public interface DentistaService {

    public List<Dentista> listarDentistas();
    public Dentista getDentista(Integer id);
}

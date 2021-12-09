package com.cassino.apostas.service;

import com.cassino.apostas.model.Torneio;
import com.cassino.apostas.repository.TorneioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TorneioService {

    @Autowired
    TorneioRepository repository;


    public Torneio salvar(Torneio torneio) {
        return repository.save(torneio);
    }

    public List<Torneio> buscarTodos() {
        return repository.findAll();
    }
}

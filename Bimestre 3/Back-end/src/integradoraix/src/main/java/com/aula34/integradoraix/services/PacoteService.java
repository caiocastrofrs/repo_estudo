package com.aula34.integradoraix.services;

import com.aula34.integradoraix.entity.Pacote;
import com.aula34.integradoraix.repositories.PacoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacoteService {

    @Autowired
    private PacoteRepository pacoteRepository;

    public Pacote adicionar(Pacote pacote) {
        return pacoteRepository.save(pacote);
    }
}

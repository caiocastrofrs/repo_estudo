package com.escola.professor.service;

import com.escola.professor.model.Treinador;
import com.escola.professor.repository.TreinadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TreinadorService {

    @Autowired
    private TreinadorRepository repository;

    public void inserir(Treinador treinador) {
        repository.save(treinador);
    }
}

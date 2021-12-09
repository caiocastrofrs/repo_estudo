package com.escola.professor.service;

import com.escola.professor.model.Equipe;
import com.escola.professor.repository.EquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipeService {

    @Autowired
    private EquipeRepository repository;

    //Inserir
    public void inserir(Equipe equipe) {
        repository.save(equipe);
    }

}

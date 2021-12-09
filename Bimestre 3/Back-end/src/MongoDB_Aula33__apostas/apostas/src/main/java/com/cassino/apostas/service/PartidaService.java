package com.cassino.apostas.service;

import com.cassino.apostas.model.Partida;
import com.cassino.apostas.repository.PartidaRepository;
import com.cassino.apostas.repository.TimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartidaService {

    @Autowired
    PartidaRepository partidaRepository;

    @Autowired
    TimeRepository timeRepository;

    public Partida salvar(Partida partida) {
        timeRepository.save(partida.getTimeLocal());
        timeRepository.save(partida.getTimeVisitante());

        return partidaRepository.save(partida);
    }

    public List<Partida> buscarTodos() {
        return partidaRepository.findAll();
    }
}

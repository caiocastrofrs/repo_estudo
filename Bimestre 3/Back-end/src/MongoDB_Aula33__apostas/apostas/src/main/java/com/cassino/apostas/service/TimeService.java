package com.cassino.apostas.service;

import com.cassino.apostas.model.Time;
import com.cassino.apostas.repository.TimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimeService {

    @Autowired
    TimeRepository repository;

    public Time salvar(Time time) {
        return repository.save(time);
    }

    public List<Time> buscarTodos() {
        return repository.findAll();
    }
}

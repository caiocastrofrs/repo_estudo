package com.aula34.integradoraix.controller;


import com.aula34.integradoraix.entity.Pacote;
import com.aula34.integradoraix.services.PacoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pacotes")
public class PacoteController {

    @Autowired
    private PacoteService pacoteService;


    @PostMapping
    public Pacote registrar(@RequestBody Pacote pacote) {
        return pacoteService.adicionar(pacote);
    }
}

package com.cassino.apostas.controller;

import com.cassino.apostas.model.Partida;
import com.cassino.apostas.service.PartidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/partidas")
public class PartidaController {

    @Autowired
    PartidaService service;

    @PostMapping
    public ResponseEntity<Partida> salvar(@RequestBody Partida partida) {
        return new ResponseEntity<>(service.salvar(partida), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Partida>> buscarTodos() {
        return new ResponseEntity<>(service.buscarTodos(), HttpStatus.OK);
    }
}

package com.cassino.apostas.controller;

import com.cassino.apostas.model.Torneio;
import com.cassino.apostas.service.TorneioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/torneios")
public class TorneioController {

    @Autowired
    TorneioService service;

    @PostMapping
    public ResponseEntity<Torneio> salvar(@RequestBody Torneio torneio) {
        return new ResponseEntity<>(service.salvar(torneio), HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<List<Torneio>> buscarTodos() {
        return new ResponseEntity<>(service.buscarTodos(), HttpStatus.OK);
    }

}

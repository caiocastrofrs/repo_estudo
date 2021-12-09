package com.cassino.apostas.controller;


import com.cassino.apostas.model.Time;
import com.cassino.apostas.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/times")
public class TimeController {

    @Autowired
    TimeService service;

    @PostMapping
    public ResponseEntity<Time> salvar(@RequestBody Time time) {
        return new ResponseEntity<>(service.salvar(time), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Time>> buscarTodos() {
        return new ResponseEntity<>(service.buscarTodos(),HttpStatus.OK);
    }
}

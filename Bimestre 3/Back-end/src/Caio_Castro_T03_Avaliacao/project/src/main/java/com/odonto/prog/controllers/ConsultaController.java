package com.odonto.prog.controllers;

import com.odonto.prog.dto.ConsultaDTO;
import com.odonto.prog.services.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consultas")
public class ConsultaController {

    @Autowired
    ConsultaService service;

    @PostMapping()
    public ResponseEntity<ConsultaDTO> salvar(@RequestBody ConsultaDTO consultaDTO) {
        return new ResponseEntity <>(service.salvar(consultaDTO), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ConsultaDTO> buscarPorId(@PathVariable Integer id) {
        ConsultaDTO consultaDTO  = service.buscarPorId(id);
        if(consultaDTO != null )
            return new ResponseEntity<>(consultaDTO, HttpStatus.OK);
        else
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ConsultaDTO> deletarPorId(@PathVariable Integer id) {

        ConsultaDTO consultaDTO  = service.deletarPorId(id);

        if(consultaDTO != null)
            return new ResponseEntity<>(consultaDTO, HttpStatus.OK);
        else
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @GetMapping()
    public ResponseEntity<List<ConsultaDTO>> buscarPorTodos() {
        return new ResponseEntity<>(service.buscarPorTodos(), HttpStatus.OK);
    }
}

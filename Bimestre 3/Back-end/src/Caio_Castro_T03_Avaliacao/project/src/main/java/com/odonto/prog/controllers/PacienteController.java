package com.odonto.prog.controllers;


import com.odonto.prog.dto.PacienteDTO;
import com.odonto.prog.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    PacienteService service;


    @PostMapping()
    public ResponseEntity<PacienteDTO> salvar(@RequestBody PacienteDTO pacienteDTO) {
        return new ResponseEntity<>(service.salvar(pacienteDTO), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PacienteDTO> buscarPorId(@PathVariable Integer id) {

        PacienteDTO pacienteDTO  = service.buscarPorId(id);

        if(pacienteDTO != null)
            return new ResponseEntity<>(pacienteDTO, HttpStatus.OK);
        else
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<PacienteDTO> deletarPorId(@PathVariable Integer id) {

        PacienteDTO paciente  = service.deletarPorId(id);

        if(paciente != null)
            return new ResponseEntity<>(paciente, HttpStatus.OK);
        else
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @PutMapping()
    public ResponseEntity<PacienteDTO> alterar(@RequestBody PacienteDTO pacienteDTO) {
        return new ResponseEntity <>(service.alterar(pacienteDTO), HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<PacienteDTO>> buscarPorTodos() {
        return new ResponseEntity<>(service.buscarPorTodos(), HttpStatus.OK);
    }
}

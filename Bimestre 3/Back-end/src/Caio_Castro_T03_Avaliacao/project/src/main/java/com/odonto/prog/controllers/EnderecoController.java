package com.odonto.prog.controllers;

import com.odonto.prog.dto.EnderecoDTO;
import com.odonto.prog.services.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoService service;

    @PostMapping()
    public ResponseEntity<EnderecoDTO> salvar(@RequestBody EnderecoDTO enderecoDTO) {
        return new ResponseEntity <>(service.salvar(enderecoDTO), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EnderecoDTO> buscarPorId(@PathVariable Integer id) {

        EnderecoDTO enderecoDTO  = service.buscarPorId(id);

        if(enderecoDTO != null)
            return new ResponseEntity<>(enderecoDTO, HttpStatus.OK);
        else
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<EnderecoDTO> deletarPorId(@PathVariable Integer id) {

        EnderecoDTO enderecoDTO  = service.deletarPorId(id);

        if(enderecoDTO != null)
            return new ResponseEntity<>(enderecoDTO, HttpStatus.OK);
        else
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @PutMapping()
    public ResponseEntity<EnderecoDTO> alterar(@RequestBody EnderecoDTO enderecoDTO) {
        return new ResponseEntity <>(service.alterar(enderecoDTO), HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<EnderecoDTO>> buscarPorTodos() {
        return new ResponseEntity<>(service.buscarPorTodos(), HttpStatus.OK);
    }
}

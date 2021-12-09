package com.odonto.prog.controllers;

import com.odonto.prog.dto.DentistaDTO;
import com.odonto.prog.services.DentistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dentistas")
public class DentistaController {

    @Autowired
    private DentistaService service;

    @PostMapping()
    public ResponseEntity<DentistaDTO> salvar(@RequestBody DentistaDTO dentistaDTO) {
        return new ResponseEntity <>(service.salvar(dentistaDTO), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DentistaDTO> buscarPorId(@PathVariable Integer id) {
        DentistaDTO dentistaDTO  = service.buscarPorId(id);
        if(dentistaDTO != null )
            return new ResponseEntity<>(dentistaDTO, HttpStatus.OK);
        else
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<DentistaDTO> deletarPorId(@PathVariable Integer id) {

        DentistaDTO dentistaDTO  = service.deletarPorId(id);

        if(dentistaDTO != null)
            return new ResponseEntity<>(dentistaDTO, HttpStatus.OK);
        else
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @PutMapping()
    public ResponseEntity<DentistaDTO> alterar(@RequestBody DentistaDTO dentistaDTO) {
        return new ResponseEntity <>(service.alterar(dentistaDTO), HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<DentistaDTO>> buscarPorTodos() {
        return new ResponseEntity<>(service.buscarPorTodos(), HttpStatus.OK);
    }

}

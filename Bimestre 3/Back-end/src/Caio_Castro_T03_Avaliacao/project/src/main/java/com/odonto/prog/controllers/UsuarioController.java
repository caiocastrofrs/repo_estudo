package com.odonto.prog.controllers;

import com.odonto.prog.dto.UsuarioDTO;
import com.odonto.prog.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {


    @Autowired
    private UsuarioService service;

    @PostMapping()
    public ResponseEntity<UsuarioDTO> salvar(@RequestBody UsuarioDTO usuarioDTO) {
        return new ResponseEntity <>(service.salvar(usuarioDTO), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioDTO> buscarPorId(@PathVariable Integer id) {
        UsuarioDTO usuarioDTO  = service.buscarPorId(id);

        if(usuarioDTO != null)
            return new ResponseEntity<>(usuarioDTO, HttpStatus.OK);
        else
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<UsuarioDTO> deletarPorId(@PathVariable Integer id) {

        UsuarioDTO usuarioDTO  = service.deletarPorId(id);

        if(usuarioDTO != null)
            return new ResponseEntity<>(usuarioDTO, HttpStatus.OK);
        else
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @PutMapping()
    public ResponseEntity<UsuarioDTO> alterar(@RequestBody UsuarioDTO usuarioDTO) {
        return new ResponseEntity <>(service.alterar(usuarioDTO), HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<UsuarioDTO>> buscarPorTodos() {
        return new ResponseEntity<>(service.buscarPorTodos(), HttpStatus.OK);
    }
}

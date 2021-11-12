package com.example.aula20.controller;

import com.example.aula20.domain.Paciente;
import com.example.aula20.service.OdontoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class OdontoController {

    @Autowired
    private OdontoService service;

    @GetMapping("listar")
    public Map<Integer, Paciente> listarPacientes(){
        return service.buscarPacientes();
    }

    @GetMapping("criar")
    public Paciente criarPacientes(){
        return service.criarPaciente();
    }

    @GetMapping("deletar/{id}")
    public String deletarPacientes(@PathVariable Integer id){
        service.deletar(id);

        return "Paciente deletado";
    }
}

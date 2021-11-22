package com.aula18.padraoMVC.odontologo.controller;

import com.aula18.padraoMVC.odontologo.model.Dentista;
import com.aula18.padraoMVC.odontologo.services.DentistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("dentistas")
public class DentistaController {

    private final DentistaService dentistaService;

    @Autowired
    public DentistaController(DentistaService dentistaService) {
        this.dentistaService = dentistaService;
    }

    @GetMapping
    public List<Dentista> getDentistas() {
        return dentistaService.listaDentistas();
    }
}

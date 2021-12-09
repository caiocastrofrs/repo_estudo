package com.example.demo.controller;


import com.example.demo.model.Dentista;
import com.example.demo.service.DentistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dentistas")
public class DentistaController {

    @Autowired
    private DentistaService dentistaService;

    @PostMapping()
    public ResponseEntity<Dentista> registrarOdontologo(@RequestBody Dentista dentista) {
        return ResponseEntity.ok(dentistaService.registrarDentista(dentista));
    }

}

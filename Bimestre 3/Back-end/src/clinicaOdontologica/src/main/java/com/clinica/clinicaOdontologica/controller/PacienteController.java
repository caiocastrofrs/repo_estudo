package com.clinica.clinicaOdontologica.controller;

import com.clinica.clinicaOdontologica.model.Endereco;
import com.clinica.clinicaOdontologica.model.Paciente;
import com.clinica.clinicaOdontologica.services.PacienteService;
import com.clinica.clinicaOdontologica.services.PacienteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class PacienteController {

    @Autowired
    PacienteService pacienteService = new PacienteServiceImpl();

    @GetMapping("/pacientes")
    @ResponseBody
    public List<Paciente> listarPacientes(Model model) {
        model.addAttribute("pacientes", pacienteService.listarPacientes());
        return pacienteService.listarPacientes();
    }
}

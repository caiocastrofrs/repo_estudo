package com.clinica.clinicaOdontologica.services;


import com.clinica.clinicaOdontologica.model.Paciente;

import java.util.List;

public interface PacienteService {

    List<Paciente> listarPacientes();
    Paciente getPacienteByEmail(String email);
}

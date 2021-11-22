package com.clinica.clinicaOdontologica.services;

import com.clinica.clinicaOdontologica.model.Consultorio;
import com.clinica.clinicaOdontologica.model.Paciente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteServiceImpl implements PacienteService{

    Consultorio consul = new Consultorio();

    @Override
    public List<Paciente> listarPacientes() {
        return consul.getPacientes();
    }

    @Override
    public Paciente getPacienteByEmail(String email) {
        for (Paciente p : consul.getPacientes()) {
            if(p.getEmail().equals(email)) {
                return p;
            }
        }
        return null;
    }
}

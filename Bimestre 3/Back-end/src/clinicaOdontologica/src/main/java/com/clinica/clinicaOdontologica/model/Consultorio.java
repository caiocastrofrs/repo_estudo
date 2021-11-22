package com.clinica.clinicaOdontologica.model;

import java.util.ArrayList;
import java.util.List;

public class Consultorio {
    List<Paciente> pacientes = new ArrayList<>();

    public Consultorio() {}

    public boolean addPaciente(Paciente paciente) {
        int count = 0;
        for (Paciente p : pacientes) {
            if(paciente == p) {
                count++;
            }
        }
        if(count == 0) {
            pacientes.add(paciente);
            return true;
        }
        return false;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }
}


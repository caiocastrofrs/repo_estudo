package com.odonto.prog.services;

import com.odonto.prog.dto.PacienteDTO;
import com.odonto.prog.entities.Paciente;
import com.odonto.prog.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PacienteService {

    @Autowired
    PacienteRepository repository;

    public PacienteDTO salvar(PacienteDTO pacienteDTO) {
        return new PacienteDTO((repository.save(new Paciente(
                pacienteDTO.getNome(),
                pacienteDTO.getSobrenome(),
                pacienteDTO.getCpf(),
                pacienteDTO.getEndereco()
        ))));
    }

    public PacienteDTO buscarPorId(Integer id) {
        Paciente paciente =  repository.getById(id);

        return new PacienteDTO(paciente);
    }

    public PacienteDTO deletarPorId(Integer id) {

        PacienteDTO pacienteDTO = new PacienteDTO(repository.getById(id));
        repository.deleteById(id);
        return pacienteDTO;
    }

    public PacienteDTO alterar(PacienteDTO pacienteDTO) {
        Paciente paciente = repository.getById(pacienteDTO.getId());

        if(pacienteDTO.getNome() != null)
            paciente.setNome(pacienteDTO.getNome());
        if(pacienteDTO.getSobrenome() != null)
            paciente.setSobrenome(pacienteDTO.getSobrenome());
        if(pacienteDTO.getCpf() != null)
            paciente.setCpf(pacienteDTO.getCpf());
        if(pacienteDTO.getEndereco() != null)
            paciente.setEndereco(pacienteDTO.getEndereco());

        return new PacienteDTO(repository.save(paciente));
    }

    public List<PacienteDTO> buscarPorTodos() {
        List<PacienteDTO> pacientesDTO = new ArrayList<>();

        for(Paciente paciente : repository.findAll() ){
            pacientesDTO.add(new PacienteDTO(paciente));
        }

        return pacientesDTO;
    }
}

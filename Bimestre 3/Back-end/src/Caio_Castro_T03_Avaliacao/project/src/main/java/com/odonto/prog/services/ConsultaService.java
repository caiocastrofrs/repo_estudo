package com.odonto.prog.services;

import com.odonto.prog.dto.ConsultaDTO;
import com.odonto.prog.entities.Consulta;
import com.odonto.prog.entities.Dentista;
import com.odonto.prog.entities.Paciente;
import com.odonto.prog.entities.Usuario;
import com.odonto.prog.repositories.ConsultaRepository;
import com.odonto.prog.repositories.DentistaRepository;
import com.odonto.prog.repositories.PacienteRepository;
import com.odonto.prog.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ConsultaService {

    @Autowired
    PacienteRepository pacienteRepository;

    @Autowired
    DentistaRepository dentistaRepository;

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    ConsultaRepository consultaRepository;


    public ConsultaDTO salvar(ConsultaDTO consultaDTO) {
        System.out.println(consultaDTO.getDentistaId());
        System.out.println(consultaDTO.getPacienteId());
        System.out.println(consultaDTO.getUsuarioId());

        Paciente paciente_id = pacienteRepository.getById(consultaDTO.getPacienteId());
        Dentista dentista_id = dentistaRepository.getById(consultaDTO.getDentistaId());
        Usuario usuario_id = usuarioRepository.getById(consultaDTO.getUsuarioId());
        return new ConsultaDTO(consultaRepository.save(
                new Consulta(
                        paciente_id,
                        dentista_id,
                        usuario_id)));

    }

    public ConsultaDTO buscarPorId(Integer id) {
        Consulta consulta = consultaRepository.getById(id);
        return new ConsultaDTO(consulta);
    }

    public ConsultaDTO deletarPorId(Integer id) {
        Consulta consulta = consultaRepository.getById(id);
        consultaRepository.deleteById(id);
        return new ConsultaDTO(consulta);
    }

    public List<ConsultaDTO> buscarPorTodos() {
        List<ConsultaDTO> consultasDTO = new ArrayList<>();
        for(Consulta consulta : consultaRepository.findAll()) {
            consultasDTO.add(new ConsultaDTO(consulta));
        }
        return consultasDTO;
    }

}

package com.odonto.prog.services;

import com.odonto.prog.dto.DentistaDTO;
import com.odonto.prog.entities.Dentista;
import com.odonto.prog.repositories.DentistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DentistaService {

    @Autowired
    DentistaRepository repository;

    public DentistaDTO salvar(DentistaDTO dentistaDTO) {
        return new DentistaDTO((repository.save(new Dentista(
                dentistaDTO.getNome(),
                dentistaDTO.getSobrenome(),
                dentistaDTO.getMatricula()
        ))));
    }

    public DentistaDTO buscarPorId(Integer id) {
        Dentista dentista =  repository.getById(id);

        return new DentistaDTO(dentista);
    }

    public DentistaDTO deletarPorId(Integer id) {

        DentistaDTO dentistaDTO = new DentistaDTO(repository.getById(id));
        repository.deleteById(id);
        return dentistaDTO;
    }

    public DentistaDTO alterar(DentistaDTO dentistaDTO) {
        Dentista dentista = repository.getById(dentistaDTO.getId());

        if(dentistaDTO.getNome() != null)
            dentista.setNome(dentistaDTO.getNome());
        if(dentistaDTO.getSobrenome() != null)
            dentista.setSobrenome(dentistaDTO.getSobrenome());
        if(dentistaDTO.getMatricula() != null)
            dentista.setMatricula(dentistaDTO.getMatricula());

        return new DentistaDTO(repository.save(dentista));
    }

    public List<DentistaDTO> buscarPorTodos() {
        List<DentistaDTO> dentistasDTO = new ArrayList<>();

        for(Dentista dentista : repository.findAll() ){
            dentistasDTO.add(new DentistaDTO(dentista));
        }

        return dentistasDTO;
    }
}

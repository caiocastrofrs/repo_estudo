package com.odonto.prog.services;

import com.odonto.prog.dto.EnderecoDTO;
import com.odonto.prog.entities.Endereco;
import com.odonto.prog.repositories.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EnderecoService {

    @Autowired
    EnderecoRepository repository;

    public EnderecoDTO salvar(EnderecoDTO enderecoDTO) {
        return new EnderecoDTO(repository.save(new Endereco(
                enderecoDTO.getRua(),
                enderecoDTO.getNumero(),
                enderecoDTO.getCidade(),
                enderecoDTO.getEstado()
        )));
    }

    public EnderecoDTO buscarPorId(Integer id) {
        Endereco endereco = repository.getById(id);
        return new EnderecoDTO(endereco);
    }

    public EnderecoDTO deletarPorId(Integer id) {
        EnderecoDTO dentistaDTO = new EnderecoDTO(repository.getById(id));
        repository.deleteById(id);
        return dentistaDTO;
    }

    public EnderecoDTO alterar(EnderecoDTO enderecoDTO) {
        Endereco endereco = repository.getById(enderecoDTO.getId());

        if(enderecoDTO.getRua() != null)
            endereco.setRua(enderecoDTO.getRua());
        if(enderecoDTO.getNumero() != null)
            endereco.setNumero(enderecoDTO.getNumero());
        if(enderecoDTO.getCidade() != null)
            endereco.setCidade(enderecoDTO.getCidade());
        if(enderecoDTO.getEstado() != null)
            endereco.setEstado(enderecoDTO.getEstado());

        return new EnderecoDTO(repository.save(endereco));
    }

    public List<EnderecoDTO> buscarPorTodos() {
        List<EnderecoDTO> enderecosDTO = new ArrayList<>();

        for(Endereco endereco : repository.findAll()) {
            enderecosDTO.add(new EnderecoDTO(endereco));
        }

        return enderecosDTO;
    }
}

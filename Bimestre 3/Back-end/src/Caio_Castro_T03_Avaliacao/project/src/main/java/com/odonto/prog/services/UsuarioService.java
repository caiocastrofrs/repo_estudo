package com.odonto.prog.services;

import com.odonto.prog.dto.UsuarioDTO;
import com.odonto.prog.entities.Usuario;
import com.odonto.prog.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public UsuarioDTO salvar(UsuarioDTO usuarioDTO) {
        return new UsuarioDTO((repository.save(new Usuario(
                usuarioDTO.getNome(),
                usuarioDTO.getEmail(),
                usuarioDTO.getAcesso()
        ))));
    }

    public UsuarioDTO buscarPorId(Integer id) {
        Usuario usuario =  repository.getById(id);

        return new UsuarioDTO(usuario);
    }

    public UsuarioDTO deletarPorId(Integer id) {
        UsuarioDTO usuarioDTO = new UsuarioDTO(repository.getById(id));
        repository.deleteById(id);
        return usuarioDTO;
    }

    public UsuarioDTO alterar(UsuarioDTO usuarioDTO) {
        Usuario usuario = repository.getById(usuarioDTO.getId());

        if(usuarioDTO.getNome() != null)
            usuario.setNome(usuarioDTO.getNome());
        if(usuarioDTO.getEmail() != null)
            usuario.setEmail(usuarioDTO.getEmail());
        if(usuarioDTO.getAcesso() != null)
            usuario.setAcesso(usuarioDTO.getAcesso());

        return new UsuarioDTO(repository.save(usuario));
    }

    public List<UsuarioDTO> buscarPorTodos() {
        List<UsuarioDTO> usuariosDTO = new ArrayList<>();

        for(Usuario usuario : repository.findAll() ){
            usuariosDTO.add(new UsuarioDTO(usuario));
        }

        return usuariosDTO;
    }
}



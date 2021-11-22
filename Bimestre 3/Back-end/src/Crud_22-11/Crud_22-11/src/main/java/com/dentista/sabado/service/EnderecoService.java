package com.dentista.sabado.service;

import com.dentista.sabado.model.Dentista;
import com.dentista.sabado.model.Endereco;
import com.dentista.sabado.repository.IDao;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {

    private IDao<Endereco> enderecoDao;

    public EnderecoService(IDao<Endereco> enderecoDao) {
        this.enderecoDao = enderecoDao;
    }

    public Endereco registrarEndereco(Endereco endereco) {
        return enderecoDao.salvar(endereco);
    }

    public void excluir(Integer id) {
        enderecoDao.excluir(id);
    }

    public Optional<Endereco> buscar(Integer id) {
        return enderecoDao.buscar(id);
    }

    public List<Endereco> buscarTodos() {
        return enderecoDao.buscarTodos();
    }

    public Endereco atualizar(Endereco dentista) {
        return enderecoDao.atualizar(dentista);
    }
}

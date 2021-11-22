package com.dentista.sabado.service;
import com.dentista.sabado.model.Paciente;
import com.dentista.sabado.repository.IDao;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {

    private IDao<Paciente> pacienteDao;

    public PacienteService(IDao<Paciente> pacienteDao) {
        this.pacienteDao = pacienteDao;
    }

    public Paciente registrarPaciente(Paciente paciente) {
        return pacienteDao.salvar(paciente);
    }

    public void excluir(Integer id) {
        pacienteDao.excluir(id);
    }

    public Optional<Paciente> buscar(Integer id) {
        return pacienteDao.buscar(id);
    }

    public List<Paciente> buscarTodos() {
        return pacienteDao.buscarTodos();
    }

    public Paciente atualizar(Paciente paciente) {
        return pacienteDao.atualizar(paciente);
    }
}

package br.com.dh.odontologia.dao.impl;

import br.com.dh.odontologia.dao.IDao;
import br.com.dh.odontologia.dao.configuracao.ConfiguracaoJDBC;
import br.com.dh.odontologia.model.Paciente;
import br.com.dh.odontologia.util.Util;

import java.sql.*;
import java.util.List;
import java.util.Optional;

public class PacienteDaoH2 implements IDao<Paciente> {

    private ConfiguracaoJDBC configuracaoJDBC;

    public PacienteDaoH2(ConfiguracaoJDBC configuracaoJDBC) {
        this.configuracaoJDBC = configuracaoJDBC;
    }

    @Override
    public Paciente salvar(Paciente paciente) {
        Connection con = configuracaoJDBC.connectBD();
        Statement stat = null;
        paciente.setEndereco(enderecoDaoH2.salvar(paciente.getEndereco()));

        String query  = String.format(
                "INSERT INTO pacientes (nome,sobrenome,rg,data,endereco_id) VALUES " +
                        "('%s','%s','%s','%s','%s')",paciente.getNome(),paciente.getSobrenome(),paciente.getRg(), Util.dateToTimestamp(paciente.getData()),paciente.getEndereco().getId());
        );
    }

    @Override
    public Optional<Paciente> buscar(Integer id) {
        return Optional.empty();
    }

    @Override
    public void excluir(Integer id) {

    }

    @Override
    public List<Paciente> buscarTodos() {
        return null;
    }
}

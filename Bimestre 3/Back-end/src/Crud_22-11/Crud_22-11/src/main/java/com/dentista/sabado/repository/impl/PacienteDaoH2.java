package com.dentista.sabado.repository.impl;

import com.dentista.sabado.model.Endereco;
import com.dentista.sabado.model.Paciente;
import com.dentista.sabado.repository.IDao;
import com.dentista.sabado.repository.config.ConfigJDBC;
import com.dentista.sabado.util.Util;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class PacienteDaoH2 implements IDao<Paciente> {

    ConfigJDBC configJDBC;
    EnderecoDaoH2 enderecoDaoH2;

    public PacienteDaoH2(EnderecoDaoH2 enderecoDaoH2) {
        this.configJDBC = new ConfigJDBC();
        this.enderecoDaoH2 = enderecoDaoH2;
    }

    public Paciente salvar(Paciente paciente) {
        Connection con = configJDBC.conectarComBancoDeDados();
        Statement stat;

        paciente.setEndereco(enderecoDaoH2.salvar(paciente.getEndereco()));

        String query = String.format("INSERT INTO pacientes (nome, sobrenome, rg, data_cadastro, endereco_id) " +
                "VALUES ('%s','%s','%s','%s','%s')",
                paciente.getNome(),
                paciente.getSobrenome(),
                paciente.getRg(),
                Util.dateToTimestamp(paciente.getDataCadastro()),
                paciente.getEndereco().getId());

        try {
            stat = con.createStatement();
            stat.executeUpdate(query,Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = stat.getGeneratedKeys();
            while(keys.next())
                paciente.setId(keys.getInt(1));
            stat.close();
            con.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }

        return paciente;
    }

    @Override
    public Optional<Paciente> buscar(Integer id) {
        Connection con = configJDBC.conectarComBancoDeDados();
        Statement stat;
        String query = String.format("SELECT * FROM pacientes WHERE id = '%s'", id);
        Paciente paciente = null;
        try {
            stat = con.createStatement();
            stat.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = stat.getGeneratedKeys();
            while(keys.next()) {
                paciente = criarObjectoPaciente(keys);
            }
            stat.close();
            con.close();
        } catch(SQLException e){
            e.printStackTrace();
        }

        return paciente != null ? Optional.of(paciente) : Optional.empty();
    }

    @Override
    public void excluir(Integer id) {
        Connection con = configJDBC.conectarComBancoDeDados();
        String query = String.format("DELETE FROM pacientes WHERE id = '%s'", id);
        execute(con,query);
    }

    @Override
    public List<Paciente> buscarTodos() {
        Connection con = configJDBC.conectarComBancoDeDados();
        Statement stat;
        String query = "SELECT * FROM pacientes";
        List<Paciente> pacientes = new ArrayList<>();
        try {
            stat = con.createStatement();
            stat.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = stat.getGeneratedKeys();
            while(keys.next()) {
                pacientes.add(criarObjectoPaciente(keys));
            }
            stat.close();
            con.close();
        } catch(SQLException e){
            e.printStackTrace();
        }
        return pacientes;
    }

    @Override
    public Paciente atualizar(Paciente paciente) {
        Connection con = configJDBC.conectarComBancoDeDados();
        String query = String.format("UPDATE pacientes SET " +
                        "nome = '%s',sobrenome = '%s',rg = '%s',dataCadastro = '%s',endereco = '%s'",
                paciente.getNome(),
                paciente.getSobrenome(),
                paciente.getRg(),
                Util.dateToTimestamp(paciente.getDataCadastro()),
                paciente.getEndereco().getId());
        execute(con, query);
        return paciente;
    }


    public void execute(Connection con, String query) {
        try {
            Statement stat = con.createStatement();
            stat.executeUpdate(query);
            stat.close();
            con.close();
        } catch( SQLException e){
            e.printStackTrace();
        }
    }

    public Paciente criarObjectoPaciente(ResultSet keys) throws SQLException{
        Endereco endereco = enderecoDaoH2.buscar(
                keys.getInt("endereco_id")).orElse(null);
        return new Paciente(
                keys.getInt("id"),
                keys.getString("nome"),
                keys.getString("sobrenome"),
                keys.getString("rg"),
                keys.getDate("data_cadastro"),
                endereco);
    }
}

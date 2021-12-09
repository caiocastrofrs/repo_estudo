package com.example.demo.repository.impl;

import com.example.demo.model.Dentista;
import com.example.demo.repository.IDao;
import com.example.demo.repository.configuracao.ConfigJDBC;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Optional;

@Repository
public class DentistaDaoH2 implements IDao<Dentista> {

    private final ConfigJDBC configJDBC;

    public DentistaDaoH2(ConfigJDBC configJDBC) {
        this.configJDBC = configJDBC;
    }

    @Override
    public Dentista salvar(Dentista dentista) {
        Connection con = configJDBC.connectDB();
        Statement stat = null;
        String query = String.format("INSERT INTO DENTISTAS (NOME,SOBRENOME,MATRICULA) VALUES " +
                "('%s','%s','%s')",dentista.getNome(),dentista.getSobrenome(),dentista.getMatricula());
        try {
            stat = con.createStatement();
            stat.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = stat.getGeneratedKeys();
            if(keys.next()) {
                dentista.setId(keys.getInt(1));
            }
            stat.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dentista;
    }

    @Override
    public Optional<Dentista> buscar(Integer id) {
        return Optional.empty();
    }

    @Override
    public void excluir(Integer id) {

    }

    @Override
    public List<Dentista> buscarTodos() {
        return null;
    }

    @Override
    public Dentista atualizar(Dentista dentista) {
        return null;
    }
}

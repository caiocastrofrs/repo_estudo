package com.dentista.sabado.repository.impl;

import com.dentista.sabado.model.Endereco;
import com.dentista.sabado.repository.IDao;
import com.dentista.sabado.repository.config.ConfigJDBC;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class EnderecoDaoH2 implements IDao<Endereco> {

    ConfigJDBC configJDBC;

    public EnderecoDaoH2(ConfigJDBC configJDBC) {
        this.configJDBC = configJDBC;
    }

    @Override
    public Endereco salvar(Endereco endereco) {
        Connection con = configJDBC.conectarComBancoDeDados();
        Statement stat;

        String query = String.format("INSERT INTO enderecos (rua, numero, cidade, estado) " +
                "VALUES ('%s','%s','%s','%s')",endereco.getRua(),endereco.getNumero(),endereco.getCidade(),endereco.getEstado());
        try {
            stat = con.createStatement();
            stat.executeUpdate(query,Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = stat.getGeneratedKeys();
            while(keys.next())
                endereco.setId(keys.getInt(1));
            stat.close();
            con.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }

        return endereco;
    }

    @Override
    public Optional<Endereco> buscar(Integer id) {
        Connection con = configJDBC.conectarComBancoDeDados();
        Statement stat;
        String query = String.format("SELECT * FROM enderecos WHERE id = '%s'", id);
        Endereco endereco = null;
        try {
            stat = con.createStatement();
            stat.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = stat.getGeneratedKeys();
            while(keys.next()) {
                endereco = criarObjectoEndereco(keys);
            }
            stat.close();
            con.close();
        } catch(SQLException e){
            e.printStackTrace();
        }

        return endereco != null ? Optional.of(endereco) : Optional.empty();
    }

    @Override
    public void excluir(Integer id) {
        Connection con = configJDBC.conectarComBancoDeDados();
        String query = String.format("DELETE FROM enderecos WHERE id = '%s'", id);
        execute(con,query);
    }

    @Override
    public List<Endereco> buscarTodos() {
        Connection con = configJDBC.conectarComBancoDeDados();
        Statement stat;
        String query = "SELECT * FROM enderecos";
        List<Endereco> enderecos = new ArrayList<>();
        try {
            stat = con.createStatement();
            stat.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = stat.getGeneratedKeys();
            while(keys.next()) {
                enderecos.add(criarObjectoEndereco(keys));
            }
            stat.close();
            con.close();
        } catch(SQLException e){
            e.printStackTrace();
        }
        return enderecos;
    }

    @Override
    public Endereco atualizar(Endereco endereco) {
        Connection con = configJDBC.conectarComBancoDeDados();
        String query = String.format("UPDATE enderecos SET " +
                "rua = '%s',numero = '%s',cidade = '%s',estado = '%s'",
                endereco.getRua(),endereco.getNumero(),endereco.getCidade(),endereco.getEstado());
        execute(con, query);
        return endereco;
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

    public Endereco criarObjectoEndereco(ResultSet keys) throws SQLException{
        return new Endereco(
                keys.getInt("id"),
                keys.getString("rua"),
                keys.getString("numero"),
                keys.getString("cidade"),
                keys.getString("estado")
                );
    }
}

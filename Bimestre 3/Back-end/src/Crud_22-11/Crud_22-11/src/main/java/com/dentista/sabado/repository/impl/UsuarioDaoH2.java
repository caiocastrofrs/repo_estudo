package com.dentista.sabado.repository.impl;

import com.dentista.sabado.model.Usuario;
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
public class UsuarioDaoH2 implements IDao<Usuario> {

    private final ConfigJDBC configJDBC;

    public UsuarioDaoH2() {
        this.configJDBC = new ConfigJDBC();
    }

    @Override
    public Usuario salvar(Usuario usuario) {
        Connection con = configJDBC.conectarComBancoDeDados();
        Statement stat = null;
        String query = String.format("INSERT INTO usuarios " +
                "(nome, email, senha, acesso) " +
                "VALUES ('%s','%s','%s','%s')"
                ,usuario.getNome(),usuario.getEmail(),usuario.getSenha(),usuario.getAcesso());
        try {
            stat = con.createStatement();
            stat.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = stat.getGeneratedKeys();
            while(keys.next()) {
                usuario.setId(keys.getInt(1));
            }
            stat.close();
            con.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return usuario;
    }

    @Override
    public Optional<Usuario> buscar(Integer id) {
        Connection con = configJDBC.conectarComBancoDeDados();
        Statement stat = null;
        String query = String.format("SELECT id, nome, email, senha, acesso " +
                "FROM usuarios WHERE id = '%s'",id);
        Usuario usuario = null;
        try {
            stat = con.createStatement();
            ResultSet keys = stat.executeQuery(query);
            while(keys.next()) {
                usuario = criarObjetoUsuario(keys);
            }
            stat.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return usuario != null ? Optional.of(usuario) : Optional.empty();
    }

    @Override
    public void excluir(Integer id) {
        Connection con = configJDBC.conectarComBancoDeDados();
        String query = String.format("DELETE FROM usuarios WHERE id = '%s'",id);
        execute(con, query);
    }

    @Override
    public List<Usuario> buscarTodos() {
        Connection con = configJDBC.conectarComBancoDeDados();
        Statement stat;
        String query = ("SELECT * FROM usuarios");
        List<Usuario> usuarios = new ArrayList<>();
        try {
            stat = con.createStatement();
            ResultSet keys = stat.executeQuery(query);
            while(keys.next()) {
                usuarios.add(criarObjetoUsuario(keys));
            }
            stat.close();
            con.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return usuarios;
    }

    @Override
    public Usuario atualizar(Usuario usuario) {
        Connection con = configJDBC.conectarComBancoDeDados();
        String query = String.format("UPDATE usuarios SET " +
                "nome = '%s', email = '%s', senha = '%s', acesso = '%s'" +
                        " WHERE id = '%s'",
                usuario.getNome(),usuario.getEmail(),usuario.getSenha(),usuario.getAcesso(),usuario.getId());
        execute(con, query);
        return usuario;
    }

    public Usuario criarObjetoUsuario(ResultSet rs) throws SQLException{
            return new Usuario(
            rs.getInt(1),
            rs.getString(2),
            rs.getString(3),
            rs.getString(4),
            rs.getInt(5));
    }

    public void execute(Connection con, String query) {
        try {
            Statement stat = con.createStatement();
            stat.executeUpdate(query);
            stat.close();
            con.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}

package br.com.dh.odontologia.dao.impl;

import br.com.dh.odontologia.dao.IDao;
import br.com.dh.odontologia.dao.configuracao.ConfigJDBC;
import br.com.dh.odontologia.model.Dentista;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DentistaDaoH2 implements IDao<Dentista> {

    private static final Logger logger = Logger.getLogger(DentistaDaoH2.class);
    ConfigJDBC configJDBC = new ConfigJDBC();

    @Override
    public Dentista salvar(Dentista dentista) {
        Connection con = configJDBC.connectDB();
        Statement stat = null;
        String query = String.format("INSERT INTO dentistas(numeroMatricula,nome,sobrenome) VALUES('%s','%s','%s')",
                dentista.getNumeroMatricula(),dentista.getNome(),dentista.getSobrenome());
        try {
            stat = con.createStatement();
            logger.info("Inserindo os dados do dentista...");
            stat.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = stat.getGeneratedKeys();
            while(keys.next()) {
                dentista.setId(keys.getInt(1));
            }
            stat.close();
            con.close();
        } catch (SQLException e) {
            logger.info("Erro ao salvar dentista");
            e.printStackTrace();
            System.out.println("erro");
        }
        logger.info("Dentista salvo com sucesso");
        System.out.println("dentista salvo!");
        return dentista;
    }

    @Override
    public Optional<Dentista> buscar(Integer id) {
        Connection con = configJDBC.connectDB();
        Statement stat = null;
        String query = String.format("SELECT * FROM dentistas WHERE id = '%s'", id);
        Dentista dentista = null;
        try {
            stat = con.createStatement();
            ResultSet rs = stat.executeQuery(query);
            while (rs.next()) {
                dentista = criarObjetoDentista(rs);
            }
            stat.close();
            con.close();
        } catch( SQLException e) {
            logger.info("Busca por dentista falhou");
            e.printStackTrace();
        }
        logger.info("Busca concluída");
        return dentista != null ? Optional.of(dentista) : Optional.empty();
    }

    @Override
    public void excluir(Integer id) {
        Connection con = configJDBC.connectDB();
        Statement stat = null;
        String query = String.format("DELETE FROM dentistas WHERE id = '%s'", id);
        try {
            stat = con.createStatement();
            stat.execute(query);
            stat.close();
            con.close();
            logger.info("Dado excluido com sucesso");
        } catch(SQLException e) {
            logger.info("Operação excluir falhou");
            e.printStackTrace();
        }

    }

    @Override
    public List<Dentista> listarTodos() {
        Connection con = configJDBC.connectDB();
        Statement stat = null;
        String query = "SELECT * FROM dentistas";
        List<Dentista> listaDentistas = new ArrayList<>();
        try {
            stat = con.createStatement();
            ResultSet rs = stat.executeQuery(query);
            while(rs.next()) {
                listaDentistas.add(criarObjetoDentista(rs));
            }
        } catch(SQLException e) {
            logger.info("Operação listarTodos falhou");
            e.printStackTrace();
        }
        logger.info("Operação listarTodos executou com sucesso!");
        return listaDentistas;
    }

    public Dentista criarObjetoDentista(ResultSet rs) {
        Dentista dentista = null;
        try {
            dentista = new Dentista(rs.getString("matriculaCadastro"), rs.getString("nome"),rs.getString("sobrenome"));
        } catch(SQLException e){
            logger.info("Criação de novo objeto Dentista falhou");
            e.printStackTrace();
        }
        logger.info("Objeto Dentista criado");
        return dentista;
    }
}

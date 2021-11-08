package br.com.dh.odontologia.dao.impl;

import br.com.dh.odontologia.dao.IDao;
import br.com.dh.odontologia.dao.configuracao.ConfigJDBC;
import br.com.dh.odontologia.model.Dentista;
import org.apache.log4j.Logger;

import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DentistaDaoH2 implements IDao<Dentista> {

    private static final Logger logger = Logger.getLogger(ConfigJDBC.class);
    ConfigJDBC configJDBC = new ConfigJDBC();

    @Override
    public Dentista salvar(Dentista dentista) {
        Connection con = configJDBC.connectDB();
        Statement stat = null;
        String query = String.format("INSERT INTO dentistas VALUES('%s','%s','%s'",
                dentista.getNumeroMatricula(),dentista.getNome(),dentista.getSobrenome());
        try {
            stat = con.createStatement();
            stat.execute(query);
            stat.close();
            con.close();
        } catch (SQLException e) {
            logger.info("Erro ao salvar dentista");
            e.printStackTrace();
        }
        logger.info("Dentista salvo com sucesso");
        return dentista;
    }

    @Override
    public Dentista buscar(Integer id) {
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
        return dentista;
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
        } catch(SQLException e) {
            logger.info("Operação excluir falhou");
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<Dentista> listarTodos() {
        Connection con = configJDBC.connectDB();
        Statement stat = null;
        String query = String.format("SELECT * FROM dentistas");
        ArrayList<Dentista> listaDentistas = new ArrayList<>();

        try {
            stat = con.createStatement();
            ResultSet rs = stat.executeQuery(query);
            while(rs.next()) {

            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public Dentista criarObjetoDentista(ResultSet rs) {
        Dentista dentista = null;
        try {
            dentista = new Dentista(rs.getString("matriculaCadastro"), rs.getString("nome"),rs.getString("sobrenome") )
        } catch(SQLException e){
            logger.info("Criação de novo objeto Dentista falhou");
        }
        logger.info("Objeto Dentista criado!");
        return dentista;
    }
}

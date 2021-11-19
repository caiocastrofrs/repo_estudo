package br.com.dh.odontologia.dao.impl;

import br.com.dh.odontologia.dao.IDao;
import br.com.dh.odontologia.dao.configuracao.ConfigJDBC;
import br.com.dh.odontologia.model.Endereco;
import br.com.dh.odontologia.model.Paciente;
import br.com.dh.odontologia.util.Util;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class PacienteDaoH2 implements IDao<Paciente> {

    private final ConfigJDBC configJDBC;
    private final EnderecoDaoH2 enderecoDaoH2;

    private static final Logger logger = Logger.getLogger(DentistaDaoH2.class);

    public PacienteDaoH2(EnderecoDaoH2 enderecoDaoH2) {
        this.configJDBC = new ConfigJDBC();
        this.enderecoDaoH2 = enderecoDaoH2;
    }

    @Override
    public Paciente salvar(Paciente paciente) {
        Connection con = configJDBC.connectDB();
        Statement stat = null;
        paciente.setEndereco(enderecoDaoH2.salvar(paciente.getEndereco()));

        String query = String.format(
                "INSERT INTO paciente (nome, sobrenome, rg, data_Cadastro, endereco_id) " +
                        "VALUES ('%s', '%s', '%s', '%s', '%s')",
                paciente.getNome(),
                paciente.getSobrenome(),
                paciente.getRg(),
                Util.dateToTimestamp(paciente.getDataCadastro()),
                paciente.getEndereco().getId());
        try {
            stat = con.createStatement();
            logger.info("Salvando paciente...");
            stat.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = stat.getGeneratedKeys();
            if (keys.next())
                paciente.setId(keys.getInt(1));
            stat.close();
        } catch (SQLException e) {
            logger.info("Operação 'salvar' falhou!");
            e.printStackTrace();
        }
        return paciente;
    }

    // Método buscar
    @Override
    public Optional<Paciente> buscar(Integer id) {
        Connection con = configJDBC.connectDB();
        Statement stat = null;
        String query = String.format(
                "SELECT id, nome, sobrenome, rg, data_cadastro, endereco_id " +
                "FROM paciente " +
                "WHERE id = '%s'", id);
        Paciente paciente = null;

        try {
            stat = con.createStatement();
            logger.info("Buscando paciente...");
            ResultSet resultado = stat.executeQuery(query);
            while (resultado.next()) {
                paciente = criarObjetoPaciente(resultado);
            }
            stat.close();
        } catch (SQLException e) {
            logger.info("Operação 'busca' falhou!");
            e.printStackTrace();
        }
        return paciente != null ? Optional.of(paciente) : Optional.empty();
    }

    // Método excluir
    @Override
    public void excluir(Integer id) {
        Connection con = configJDBC.connectDB();
        Statement stat = null;
        String query = String.format(
                "DELETE FROM paciente WHERE id = '%s'", id);
        try {
            stat = con.createStatement();
            logger.info("Excluindo paciente...");
            stat.executeUpdate(query);
            stat.close();
        } catch (SQLException e) {
            logger.info("Operação 'excluir' falhou!");
            e.printStackTrace();
        }
    }

    // Método buscarTodos
    @Override
    public List<Paciente> listarTodos() {
        Connection con = configJDBC.connectDB();
        Statement stat = null;
        String query = "SELECT * FROM paciente";
        List<Paciente> pacientes = new ArrayList<>();
        try {
            stat = con.createStatement();
            logger.info("Listando todos os pacientes...");
            ResultSet resultado = stat.executeQuery(query);
            while (resultado.next()) {
                pacientes.add(criarObjetoPaciente(resultado));
            }
            stat.close();
        }
        catch (SQLException e) {
            logger.info("Operação 'listarTodos' falhou!");
            e.printStackTrace();
        }

        return pacientes;
    }

    // Método criarObjetoEndereco
    private Paciente criarObjetoPaciente(ResultSet resultado) throws SQLException {
        Integer idP = resultado.getInt("id");
        String nome = resultado.getString("nome");
        String sobrenome = resultado.getString("sobrenome");
        String rg = resultado.getString("rg");
        Date dataCadastro = resultado.getDate("data_cadastro");
        Endereco endereco = enderecoDaoH2.buscar(
                resultado.getInt("endereco_id")).orElse(null);
        return new Paciente(idP, nome, sobrenome, rg, dataCadastro, endereco);
    }

}

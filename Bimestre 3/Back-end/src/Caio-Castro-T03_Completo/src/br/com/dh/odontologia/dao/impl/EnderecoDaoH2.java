package br.com.dh.odontologia.dao.impl;

import br.com.dh.odontologia.dao.IDao;
import br.com.dh.odontologia.dao.configuracao.ConfigJDBC;
import br.com.dh.odontologia.model.Endereco;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EnderecoDaoH2 implements IDao<Endereco> {

    private static final Logger logger = Logger.getLogger(DentistaDaoH2.class);

    private final ConfigJDBC configJDBC;

    public EnderecoDaoH2() {
        this.configJDBC = new ConfigJDBC();
    }

    // Método salvar
    @Override
    public Endereco salvar(Endereco endereco) {
        Connection con = configJDBC.connectDB();
        Statement stat = null;
        String query = String.format(
                "INSERT INTO endereco " +
                "(rua, numero, bairro, cidade) " +
                "VALUES ('%s', '%s', '%s', '%s')",
                endereco.getRua(), endereco.getNumero(),
                endereco.getBairro(), endereco.getCidade());

        try {
            logger.info("Salvando endereço...");
            stat = con.createStatement();
            stat.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = stat.getGeneratedKeys();
            if(keys.next())
                endereco.setId(keys.getInt(1));
            stat.close();
            con.close();
        }
        catch (SQLException e) {
            logger.info("Operação 'salvar' falhou!");
            e.printStackTrace();
        }
        return endereco;
    }

    // Método buscar
    @Override
    public Optional<Endereco> buscar(Integer id) {
        Connection con = configJDBC.connectDB();
        Statement stat = null;
        String query = String.format(
                "SELECT id, rua, numero, cidade, bairro " +
                "FROM endereco " +
                "WHERE id = '%s'", id);
        Endereco endereco = null;
        try {
            logger.info("Buscando endereço...");
            stat = con.createStatement();
            ResultSet resultado = stat.executeQuery(query);

            while (resultado.next()){
                endereco = criarObjetoEndereco(resultado);
            }
            stat.close();
            con.close();
        }
        catch (SQLException e) {
            logger.info("Operação 'busca' falhou!");
            e.printStackTrace();
        }

        return endereco != null ? Optional.of(endereco) : Optional.empty();
    }

    // Método excluir
    @Override
    public void excluir(Integer id) {
        Connection con = configJDBC.connectDB();
        Statement stat = null;
        String query = String.format(
                "DELETE FROM endereco WHERE id = '%s'", id);
        try {
            logger.info("Excluindo endereço...");
            stat = con.createStatement();
            stat.executeUpdate(query);
            stat.close();
        } catch (SQLException e) {
            logger.info("Operação 'excluir' falhou!");
            e.printStackTrace();
        }
    }

    // Método buscarTodos
    @Override
    public List<Endereco> listarTodos() {
        Connection con = configJDBC.connectDB();
        Statement stat = null;
        String query = "SELECT * FROM endereco";
        List<Endereco> enderecos = new ArrayList<>();
        try {
            logger.info("Buscando todos os endereços...");
            stat = con.createStatement();
            ResultSet result = stat.executeQuery(query);
            while (result.next()) {
                enderecos.add(criarObjetoEndereco(result));
            }
            stat.close();
        }
            catch (SQLException e) {
            logger.info("Operação 'listarTodos' falhou!");
            e.printStackTrace();
        }
            return enderecos;
    }

    // Método criarObjetoEndereco
    private Endereco criarObjetoEndereco(ResultSet resultado) throws SQLException {
        Integer id = resultado.getInt("id");
        String rua = resultado.getString("rua");
        String numero = resultado.getString("numero");
        String bairro = resultado.getString("bairro");
        String cidade = resultado.getString("cidade");
        return new Endereco(id, rua, numero, bairro, cidade);
    }
}

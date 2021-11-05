package Mesa_Aula12_BD.src;

import java.sql.*;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class App {

    private static final String SqlCreateTable =
            "DROP TABLE IF EXISTS funcionarios;"
                    + "CREATE TABLE funcionarios("
                    + "id INT PRIMARY KEY NOT NULL,"
                    + "nome VARCHAR(16),"
                    + "sobrenome VARCHAR(32),"
                    + "idade int,"
                    + "profissao VARCHAR(32);";

    private static final String sqlInsert =
            "INSET INTO funcionarios (id,nome, sobrenome, idade, profissao)"
                    + "VALUES (1,'caio','castro',22,'vagabundo'),"
                    + "(2,'icaro','castro',21,'tatuador'),"
                    + "(1,'caio','castro',22,'vagabundo');";

    private static final String sqlInsertDadosRepetidos =
            "INSET INTO funcionarios (id,nome, sobrenome, idade, profissao)"
            + " VALUES (1,'caio','castro',22,'vagabundo');";
    private static final String sqlUpdate =
            "UPDATE funcionarios "
            + "SET nome = 'adso'"
            + "WHERE id = 1";

    private static final String sqlDelete =
            "DELETE FROM funcionarios WHERE id = 2";

    private static final Logger logger = Logger.getLogger(App.class);
    public static void main(String[] args) throws Exception {
        Connection con = null;
        BasicConfigurator.configure();
        try {
            con = DriverManager.getConnection("http://192.168.144.1:8082?key=407cfb9f48e70fac7cfe4ea8b1337ef92423bf5e6fb57c81ed53152ab5b299ba/~/test","sa","");
            Statement stat = con.createStatement();
            stat.execute(SqlCreateTable);
            logger.info("Tabela criada com sucesso!");
            stat.execute(sqlInsert);
            logger.info("Dados inseridos com sucesso!");
            stat.execute(sqlUpdate);
            logger.info("Dados atualizados com sucesso!");
            stat.execute(sqlDelete);
            logger.info("Dados deletados com sucesso!");
            stat.execute(sqlInsertDadosRepetidos);
            logger.info("Dados repetidos inseridos com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

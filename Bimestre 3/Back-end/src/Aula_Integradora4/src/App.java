package Aula_Integradora4.src;

import java.sql.*;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class App {

    private static final String sqlCreateTable =
            "DROP TABLE IF EXISTS usuarios; " +
            "CREATE TABLE usuarios (" +
            "id int AUTO_INCREMENT PRIMARY KEY," +
            "primeiroNome VARCHAR(32) NOT NULL," +
            "sobrenome VARCHAR(32) NOT NULL," +
            "idade INT NOT NULL," +
            "altura DOUBLE NOT NULL," +
            "peso DOUBLE NOT NULL," +
            "matriculado boolean NOT NULL);";

    private static final String sqlInsert = "INSERT INTO usuarios (primeiroNome, sobrenome, idade, altura, peso, matriculado) " +
            "VALUES ('caio','castro',22, 1.83, 77.7, true), ('icaro','castro',21, 1.78, 75.7, false), ('adso','castro', 34, 1.80, 75.7, true), ('diego','castro', 31, 1.75, 77.7, true);";

    private static final String sqlDelete = "DELETE FROM usuarios WHERE id = 1";

//    public static Connection getConnection() throw Exception {
//        Class.forName("org.h2.Driver");
//        return DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa","");
//    }
    //DECLARAÇÃO DO LOGGER
    private static final Logger logger = Logger.getLogger(App.class);


    //MAIN
    public static void main(String[] args) throws Exception{
        //Configuração do Logging
        BasicConfigurator.configure();

        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa","");
            Statement stat = con.createStatement();
            stat.execute(sqlCreateTable);
            logger.info("Tabela criada com sucesso!");
            stat.execute(sqlInsert);
            logger.info("Informações inseridas com sucesso!");
            stat.execute(sqlDelete);
            logger.info("Exclusões de dados SQL executada com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(con == null) {
                return;
            }
        }
    }


}

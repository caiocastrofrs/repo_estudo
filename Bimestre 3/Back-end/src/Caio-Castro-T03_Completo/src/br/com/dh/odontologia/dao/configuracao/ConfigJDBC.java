package br.com.dh.odontologia.dao.configuracao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.apache.log4j.Logger;


public class ConfigJDBC {

    private static final Logger logger = Logger.getLogger(ConfigJDBC.class);

    private String jdbcDriver;
    private String dbUrl;
    private String user;
    private String password;

    public ConfigJDBC(String jdbcDriver, String dbUrl, String user, String password) {
        this.jdbcDriver = jdbcDriver;
        this.dbUrl = dbUrl;
        this.user = user;
        this.password = password;
    }

    public ConfigJDBC() {
        this.jdbcDriver = "org.h2.Driver";
        this.dbUrl = "jdbc:h2:~/clinica;DB_CLOSE_DELAY=-1;INIT=RUNSCRIPT FROM 'src/create.sql'";
        this.user = "sa";
        this.password = "";
    }

    public Connection connectDB() {
        Connection con = null;
        try {
            logger.info("Estabelecendo conexão com banco de dados...");
            con = DriverManager.getConnection(dbUrl, user, password);
        } catch(SQLException e) {
            logger.info("Conexão com banco de dados falhou");
            e.printStackTrace();
        }
        logger.info("Conexão estabelecida!");

        return con;
    }
}

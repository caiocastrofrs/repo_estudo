package br.com.dh.odontologia.dao.configuracao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.apache.log4j.Logger;


public class ConfigJDBC {

    private static final Logger logger = Logger.getLogger(ConfigJDBC.class);

    private String driver;
    private String dbUrl;
    private String user;
    private String password;

    public ConfigJDBC(String driver, String dbUrl, String user, String password) {
        this.driver = driver;
        this.dbUrl = dbUrl;
        this.user = user;
        this.password = password;
    }

    public ConfigJDBC() {
        this.driver = "org.h2.Driver";
        this.dbUrl = "jdbc:h2:~/clinica;DB_CLOSE_DELAY=-1;INIT=RUNSCRIPT FROM 'src/create.sql'";
        this.user = "sa";
        this.password = "";
    }

    public Connection connectDB() {
        Connection con = null;
        logger.info("Estabelecendo conexão com banco de dados...");
        try {
            con = DriverManager.getConnection(dbUrl, user, password);

        } catch(SQLException e) {
            logger.info("Conexão com banco de dados falhou");
            e.printStackTrace();
        }
        logger.info("Conexão estabelecida!");
        return con;
    }
}

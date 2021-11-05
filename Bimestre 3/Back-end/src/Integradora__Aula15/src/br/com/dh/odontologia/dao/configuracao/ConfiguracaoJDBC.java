package br.com.dh.odontologia.dao.configuracao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfiguracaoJDBC {

    private String jdbcDriver;
    private String dbUrl;
    private String user;
    private String password;

    public ConfiguracaoJDBC(String jdbcDriver, String dbUrl, String user, String password) {
        this.jdbcDriver = jdbcDriver;
        this.dbUrl = dbUrl;
        this.user = user;
        this.password = password;
    }
    public ConfiguracaoJDBC() {
        jdbcDriver = "org.h2.Driver";
        dbUrl = "jdbc:h2:~/clinica;DB_CLOSE_DELAY=-1;INIT=RUNSCRIPT FROM 'CREATE.sql'";
        user = "sa";
        password = "";
    }

    public Connection connectBD() {
        Connection con = null;

        try {
            con = DriverManager.getConnection(dbUrl,user,password);
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
}

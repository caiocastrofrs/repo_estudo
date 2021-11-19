package com.example.demo.repository.configuracao;

import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Configuration
public class ConfigJDBC {

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
        this.dbUrl = "jdbc:h2:mem:clinica; DB_CLOSE_DELAY=-1; INIT=RUNSCRIPT FROM 'data.sql'";
        this.user = "sa";
        this.password = "";
    }

    public Connection connectDB() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(dbUrl, user, password);
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

}

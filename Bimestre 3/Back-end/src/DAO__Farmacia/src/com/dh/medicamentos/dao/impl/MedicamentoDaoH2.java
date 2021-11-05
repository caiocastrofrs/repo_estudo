package com.dh.medicamentos.dao.impl;

import com.dh.medicamentos.dao.ConfigJDBC;
import com.dh.medicamentos.dao.IDao;
import com.dh.medicamentos.model.Medicamento;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MedicamentoDaoH2 implements IDao<Medicamento> {

    private ConfigJDBC configJDBC;

    public MedicamentoDaoH2(ConfigJDBC configJDBC) {
        this.configJDBC = configJDBC;
    }

    //Aqui ficam as interfaces
    //Salvar

    public Medicamento salvar(Medicamento m) {
        Connection con = configJDBC.connectDB();
        Statement stat = null;
        String query = String.format(
                "INSERT INTO medicamentos(nome,laboratorio,quantidade,preco) VALUES('%s','%s','%s','%s')",
                m.getNome(),m.getLaboratorio(),m.getQuantidade(),m.getPreco());
        try {
            stat = con.createStatement();
            stat.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = stat.getGeneratedKeys();
            if(keys.next())
                m.setId(keys.getInt(1));
            stat.close();
            con.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return m;
    }

    //Buscar p/ ID
    public Medicamento buscar(Integer id) {
        Connection con = configJDBC.connectDB();
        Statement stat = null;
        String query = String.format("SELECT * FROM medicamentos WHERE id = '%s'",id);
        Medicamento medicamento = null;
        try {
            stat = con.createStatement();
            ResultSet rs = stat.executeQuery(query);
            while(rs.next()) {
                medicamento = new Medicamento(
                        rs.getInt("id")
                        ,rs.getString("nome")
                        ,rs.getString("laboratorio")
                        ,rs.getInt("quantidade")
                        ,rs.getDouble("preco"));
            }
            stat.close();
            con.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return medicamento;
    }
}

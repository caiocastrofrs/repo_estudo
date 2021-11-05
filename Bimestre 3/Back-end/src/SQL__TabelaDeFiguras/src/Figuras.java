package SQL__TabelaDeFiguras.src;

import java.sql.*;

public class Figuras {

    private static final String sqlCreateTable = "DROP TABLE IF EXISTS figuras; " +
            "CREATE TABLE figuras " +
            "(id INT AUTO_INCREMENT PRIMARY KEY, figura VARCHAR(32), cor VARCHAR(16))";

    private static final String sqlInsert = "INSERT INTO figuras (figura, cor) " +
            "VALUES ('circulo', 'índigo'), ('circulo', 'vermelho'), ('quadrado', 'verde agua'), "
            + "('quadrado', 'amarelo'), ('quadrado', 'preto'), ('quadrado', 'vermelho')";

    private static void getCores(Connection con) throws SQLException {
        Statement stat = con.createStatement();
        String sqlQuery = "SELECT * FROM FIGURAS WHERE cor = 'vermelho'";
        ResultSet rs = stat.executeQuery(sqlQuery);

        while (rs.next()) {
            System.out.println("------------------------------");
            System.out.println(rs.getInt(1) + " " +
                    rs.getString(2) + " " +
                    rs.getString(3));
        }

    }
    public static void main(String[] args) throws Exception{
        Class.forName("org.h2.Driver");
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
            Statement stat = con.createStatement();
            stat.execute(sqlCreateTable);
            stat.execute(sqlInsert);
            getCores(con);
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            if(con == null)
                return;
            try {
                con.close();
            } catch(SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

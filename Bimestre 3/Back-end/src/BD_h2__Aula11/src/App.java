package BD_h2__Aula11.src;

import java.sql.*;

public class App {

    private static final String sqlCreateTable = "DROP TABLE IF EXISTS ANIMAL; " +
            "CREATE TABLE ANIMAL " +
            "(id INT AUTO_INCREMENT PRIMARY KEY, nome VARCHAR(32), tipo VARCHAR(16))";

    private static final String sqlInsert = "INSERT INTO ANIMAL (nome, tipo) " +
            "VALUES('sapo', 'anfíbio'), ('pingelo, 'rato'), ('dumbo', 'elefante')";

    private static final String sqlDelete = "DELETE FROM ANIMAL WHERE ID = 2";

    public static void main(String[] args) throws Exception{
//        Class.forName("org.h2.Driver");
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
            Statement stat = con.createStatement();
            stat.execute(sqlCreateTable);
            stat.execute(sqlInsert);
            showAnimal(con);
            stat.execute(sqlDelete);
            showAnimal(con);
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
    private static void showAnimal(Connection con) throws SQLException {
        Statement stat = con.createStatement();

        String sqlQuery = "SELECT * FROM ANIMAL";
        ResultSet rs = stat.executeQuery(sqlQuery);
        while(rs.next()) {
            System.out.println("------------------------------");
            System.out.println(rs.getInt(1) + " " +
                    rs.getString(2) + " " +
                    rs.getString(3));
        }
    }
}

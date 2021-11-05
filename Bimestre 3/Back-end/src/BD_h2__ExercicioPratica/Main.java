package BD_h2__ExercicioPratica;
import java.sql.*;

public class Main {

    private static final String sqlCreateTable = "DROP TABLE IF EXISTS funcionarios;" +
            "CREATE TABLE funcionarios(" +
            "id int PRIMARY KEY NOT NULL," +
            "nome VARCHAR(32)," +
            "idade VARCHAR(2)," +
            "empresa VARCHAR(50)," +
            "data VARCHAR(8)" +
            ");";
//    private static final String sqlInsert = "INSERT INTO funcionarios " +
//            "VALUES " +
//            "('1','caio','22,'Digital House','12/03/99');" +
//            "('2','icaro','21,'Google','25/11/00');" +
//            "('3','diego','31,'Facebook','26/07/89');";

    private static void insertFunc(Statement t, Funcionario f) throws SQLException {
        String sqlInsert = String.format("INSERT INTO funcionarios " +
        "VALUES VALUES('%s','%s','%s','%s','%s')",f.getId(),f.getNome(),f.getIdade(),f.getEmpresa(),f.getData());
        t.execute(sqlInsert);
    }
    public static void main(String[] args) throws ClassNotFoundException {
        //Class.forName("org.h2.Driver");
        Funcionario caio = new Funcionario(1,"Caio",22,"Vagabundo","12/03/99");
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
            Statement stat = con.createStatement();
            stat.execute(sqlCreateTable);
            insertFunc(stat,caio);
            showDados(con);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void showDados(Connection con) throws SQLException {
        Statement stat = con.createStatement();
        String sqlQuery = "SELECT * FROM funcionarios";
        ResultSet rs = stat.executeQuery(sqlQuery);

        while(rs.next()) {
            System.out.println(rs.getInt(1));
            System.out.println(rs.getInt(2));
            System.out.println(rs.getInt(3));
            System.out.println(rs.getInt(4));
            System.out.println(rs.getInt(5));
        }
    }
}

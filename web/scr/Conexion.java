package scr;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public static void main(String[] args) throws SQLException {
            String dbURL = "jdbc:derby://localhost:1527/DevInfo.Pub;create=true";
            String user = "DevInfo.Pub";
            String password = "123";
            Connection con = DriverManager.getConnection(dbURL, user, password);
            if (con != null) {
                System.out.println("Connected to database");
            }
    }
}

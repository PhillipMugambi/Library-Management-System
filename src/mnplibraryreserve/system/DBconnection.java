package mnplibraryreserve.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {

    public static Connection Connect() {
        Connection conn = null;
        try {
            String url1 = "jdbc:mysql://127.0.0.1:3306/library";
            String user = "root";
            String password = "";
            conn = (Connection) DriverManager.getConnection(url1, user, password);
            if (conn != null) {
                System.out.println("Successfly connected to database");
            }
        } catch (SQLException ex) {
            System.out.println("" + ex);
        }
        return conn;

    }

}

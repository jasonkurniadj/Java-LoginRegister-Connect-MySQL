package loginregisterdb;

import java.sql.*;

/**
 *
 * @author Jason.
 */
public class Database {
    public static Connection conn;

    public static Connection getCon(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/login_register", "root", "");
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {

    public Connection getDMConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Cannot find the driver in the classpath!", e);
        }
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:3306;databaseName=testdba", "root", "xdbG3RpZmjKinGDy183H");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

}

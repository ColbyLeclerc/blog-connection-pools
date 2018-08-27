package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {

    public Connection getDMConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Cannot find the driver in the classpath!", e);
        }
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:sqlserver://SERVERIP:PORT;databaseName=DATABASE", "USER", "PASS");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

}
